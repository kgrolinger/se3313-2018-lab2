package ca.uwo.eng.se3313.lab2;

import android.graphics.Bitmap;
import android.support.annotation.NonNull;
import android.support.annotation.UiThread;
import android.support.annotation.WorkerThread;

/**
 * Interface describing the ImageDownloader details.
 *
 * Implementers of this interface must implement the {@link #download(String, SuccessHandler, ErrorHandler)}
 * method and use {@link ErrorHandler} implementations to handle when an error happens with
 * downloading.
 *
 * The suggested implementation would create handleres inline within calls to
 * {@link #download(String, SuccessHandler, ErrorHandler)}
 *
 */
public interface IImageDownloader {

    @FunctionalInterface
    public interface ErrorHandler {

        /**
         * Run in the UI thread when an error occurs.
         *
         * @param error The exception that occurred.
         */
        void onError(@NonNull final Throwable error);

    }

    @FunctionalInterface
    public interface SuccessHandler {

        /**
         * Run when an image is successfully downloaded.
         *
         * @param image The image downloaded
         */
        void onComplete(@NonNull final Bitmap image);

    }

    /**
     * <b>Asynchronously</b> downloads an image from the imageUrl passed.
     *
     * The suggested implementation will use {@link android.os.AsyncTask} to run download code. Any
     * exceptions occuring will utilize an {@link ErrorHandler} instance to have the calling code
     * handle errors.
     *
     *
     * @param imageUrl String URL to download from.
     * @param handler Code to execute in the UI thread on success (accepts a {@link Bitmap}).
     * @param errorHandler Code to execute in the UI thread on error.
     *
     * @throws IllegalArgumentException if imageUrl is not a valid {@link java.net.URL}, delegated
     *                                  from {@link java.net.MalformedURLException}.
     */
    @UiThread
    void download(@NonNull String imageUrl, @NonNull SuccessHandler handler, @NonNull ErrorHandler errorHandler);

}
