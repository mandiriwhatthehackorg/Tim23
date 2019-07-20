package com.mandiriexel.core.api

import com.google.gson.annotations.SerializedName
import com.mandiriexel.core.model.transfer.TransferRequest
import com.mandiriexel.core.model.transfer.TransferResponse
import kotlinx.coroutines.Deferred
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Query

interface DataApi {

    @POST("TrxAndPaymentAPI/1.0/transfer")
    fun sendTransfer(@Body request: TransferRequest): Deferred<Response<TransferResponse>>
    /*
    @GET("movie/now_playing")
    fun getNowPlayingMovie(@QueryMap map : Map<String, String>): Observable<MovieResponse>

    @GET("movie/upcoming")
    fun getUpcomingMovie(@QueryMap map : Map<String, String>): Observable<MovieResponse>

    @GET("movie/popular")
    fun getPopularMovie(@QueryMap map : Map<String, String>): Observable<MovieResponse>

    @GET("movie/{movie_id}")
    fun getMovieDetails(@Path("movie_id") id: String, @QueryMap map: Map<String, String>): Observable<MovieDetail>

    @GET("movie/{movie_id}/videos")
    fun getMovieVideos(@Path("movie_id") id: String): Observable<VideoResponse>
    */
}