package com.hpexports.Webservice;



import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;

public interface WebServices {

    /*@POST("login")
    io.reactivex.Observable<GetLoginResponse>
    getLoginResponse(@Body LoginJson loginJson);

    @POST("verifyOTP")
    io.reactivex.Observable<VerifyOTPResponse>
    getVerifyOTPResponse(@Body VerifyOTPJson verifyOTPJson);

    @Multipart
    @POST("updateProfile")
    io.reactivex.Observable<UpdateProfileResponse>
    getUpdateProfileResponse(@Header("Authorization") String authorization,
                             @Part("profileData") RequestBody profileData,
                             @Part MultipartBody.Part aadhaarFrontImage,
                             @Part MultipartBody.Part aadhaarBackImage);


    @GET("getProfile")
    io.reactivex.Observable<GetProfileResponse>
    getProfileResponse(@Header("Authorization") String authorization);

    @Multipart
    @POST("updateProfilePhoto")
    io.reactivex.Observable<UpdateProfileResponse>
    getUpdateProfilePhotoResponse(@Header("Authorization") String authorization, @Part MultipartBody.Part filePart);

    @POST("addAddress")
    io.reactivex.Observable<GetLoginResponse>
    getAddAddressResponse(@Header("Authorization") String authorization,@Body AddAddressJson addAddressJson);

    @GET("logout")
    io.reactivex.Observable<GetLoginResponse>
    getLogoutResponse(@Header("Authorization") String authorization);

    @POST("addFoodPost")
    io.reactivex.Observable<AddFoodPostResponse>
    getAddFoodPostResponse(@Header("Authorization") String authorization,@Body AddFoodPostJson addFoodPostJson);

    @POST("editFoodPost")
    io.reactivex.Observable<AddFoodPostResponse>
    getEditMyFoodPostListResponse(@Header("Authorization") String authorization, @Body EditMyFoodPostJson editMyFoodPostJson);

    @POST("getFoodPostList")
    io.reactivex.Observable<GetHomeFoodPostListResponse>
    getHomeFoodPostListResponse(@Header("Authorization") String authorization, @Body FoodPostListJson foodPostListJson );

    @POST("sendRequest")
    io.reactivex.Observable<GetLoginResponse>
    getSendRequestResponse(@Header("Authorization") String authorization,@Body SendRequestJson sendRequestJson);

    @GET("getMyFoodPostList")
    io.reactivex.Observable<GetMyFoodPostListResponse>
    getMyFoodPostListResponse(@Header("Authorization") String authorization);

    @POST("getMyFoodPostRequests")
    io.reactivex.Observable<GetMyFoodPostRequestsResponse>
    getMyFoodPostRequestsResponse(@Header("Authorization") String authorization, *//*@Query("postId") String postId),*//*@Body GetMyFoodPostRequestsJson getMyFoodPostRequestsJson);

    @POST("acceptRequest")
    io.reactivex.Observable<AcceptRequestResponse>
    getAcceptRequestResponse(@Header("Authorization") String authorization,@Body AcceptRequestJson acceptRequestJson);

    @POST("rejectRequest")
    io.reactivex.Observable<RejectRequestResponse>
    getRejectRequestResponse(@Header("Authorization") String authorization,@Body AcceptRequestJson requestJson);

    @GET("getFoodRequestsList")
    io.reactivex.Observable<GetFoodRequestsListResponse>
    getFoodRequestsListResponse(@Header("Authorization") String authorization);

    @POST("deleteFoodPost")
    io.reactivex.Observable<GetLoginResponse>
    getDeleteFoodPostResponse(@Header("Authorization") String authorization,@Body DeleteFoodPostJson deleteFoodPostJson);

    @POST("giveRating")
    io.reactivex.Observable<GetLoginResponse>
    getFeedbackResponse(@Header("Authorization") String authorization,@Body RatingJson ratingJson);

    @POST("cancelRequest")
    io.reactivex.Observable<CancelRequestResponse>
    getCancelRequestResponse(@Header("Authorization") String authorization,@Body CancelRequestResponseJson cancelRequestResponseJson);
*/
}
