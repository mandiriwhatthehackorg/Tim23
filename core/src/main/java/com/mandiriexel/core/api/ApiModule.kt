package ccom.apps.core.api

import com.mandiriexel.core.BuildConfig
import com.mandiriexel.core.api.DataApi
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit
import javax.inject.Named
import javax.inject.Singleton


@Module
class ApiModule{
    @Provides @Singleton @Named("baseUrl")
    fun provideBaseUrl(): String{
        return BuildConfig.BASE_URL
    }

    @Provides @Singleton
    fun provideDataDbApi(retrofit: Retrofit): DataApi {
        return retrofit.create(DataApi::class.java)
    }
}