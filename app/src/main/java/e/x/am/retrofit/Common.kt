 package practice.library.retrofit

import androidx.lifecycle.MutableLiveData
import practice.library.models.User

enum class loginUserEnum {
    Ok,
    NotFound,
    WrongPassword,
    FailedRequest
}

enum class createUserEnum {
    Ok,
    LoginPatternMismatch,
    LoginRepeat,
    PasswordTooEasy,
    InvalidPassword,
    NoReaction
}

object Common {
    private val BASE_URL = "https://library-api.mrtstg.ru/"
    val retrofitService: RetrofitService
        get() = RetrofitClient.getClient(BASE_URL).create(RetrofitService::class.java)

    public var currentUser: User? = null;
    public var allUsers: MutableLiveData<MutableList<User>> = MutableLiveData();
    public var userLoginState: loginUserEnum? = null;
    public var userCreateState: MutableLiveData<createUserEnum> = MutableLiveData();

}