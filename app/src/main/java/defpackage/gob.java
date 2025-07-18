package defpackage;

import android.content.ContentResolver;
import android.database.Cursor;
import android.media.MediaMetadata;
import android.media.session.PlaybackState;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gob implements goa {
    public static final zdy a = zdy.h("com/google/android/apps/tvsearch/media/control/KidsModeMediaControllerImpl");
    private static final Uri b;
    private static final Uri c;
    private final ContentResolver d;

    static {
        Uri uriBuild = new Uri.Builder().scheme("content").authority("com.google.android.apps.tv.launcherx.profile.contentprovider.AppAccessContentProvider").appendPath("queryMedia").build();
        uriBuild.getClass();
        b = uriBuild;
        Uri uriBuild2 = new Uri.Builder().scheme("content").authority("com.google.android.apps.tv.launcherx.profile.contentprovider.AppAccessContentProvider").build();
        uriBuild2.getClass();
        c = uriBuild2;
    }

    public gob(ContentResolver contentResolver) {
        this.d = contentResolver;
    }

    private final Cursor d() {
        try {
            return this.d.query(b, null, null, null, null);
        } catch (SecurityException e) {
            ((zdv) ((zdv) a.d()).p(e).q("com/google/android/apps/tvsearch/media/control/KidsModeMediaControllerImpl", "queryLauncherxKidsMediaInfoContentProvider", 138, "KidsModeMediaControllerImpl.kt")).u("Only apps signed with Google in user 0 has access to this content provider.");
            return null;
        } catch (UnsupportedOperationException e2) {
            ((zdv) ((zdv) a.d()).p(e2).q("com/google/android/apps/tvsearch/media/control/KidsModeMediaControllerImpl", "queryLauncherxKidsMediaInfoContentProvider", 140, "KidsModeMediaControllerImpl.kt")).u("Failed to get Google certificates from remote.");
            return null;
        }
    }

    @Override // defpackage.goa
    public final List a() {
        Cursor cursorD = d();
        ArrayList arrayList = null;
        if (cursorD != null) {
            try {
                ArrayList arrayList2 = new ArrayList();
                if (cursorD.getColumnCount() < 3) {
                    aguc.a(cursorD, null);
                    return arrayList2;
                }
                while (cursorD.moveToNext()) {
                    String string = cursorD.getString(0);
                    try {
                        byte[] blob = cursorD.getBlob(1);
                        byte[] blob2 = cursorD.getBlob(2);
                        blob.getClass();
                        Parcelable.Creator creator = PlaybackState.CREATOR;
                        creator.getClass();
                        PlaybackState playbackState = (PlaybackState) fen.c(blob, creator);
                        blob2.getClass();
                        Parcelable.Creator creator2 = MediaMetadata.CREATOR;
                        creator2.getClass();
                        MediaMetadata mediaMetadata = (MediaMetadata) fen.c(blob2, creator2);
                        string.getClass();
                        playbackState.getClass();
                        mediaMetadata.getClass();
                        arrayList2.add(new goc(string, playbackState, mediaMetadata));
                    } catch (ClassCastException e) {
                        ((zdv) ((zdv) a.d()).p(e).q("com/google/android/apps/tvsearch/media/control/KidsModeMediaControllerImpl", "queryKidsMediaSessionInfoFromLauncherx", 64, "KidsModeMediaControllerImpl.kt")).u("Failed to extract media session info.");
                    } catch (OutOfMemoryError e2) {
                        ((zdv) ((zdv) a.d()).p(e2).q("com/google/android/apps/tvsearch/media/control/KidsModeMediaControllerImpl", "queryKidsMediaSessionInfoFromLauncherx", 66, "KidsModeMediaControllerImpl.kt")).u("Failed to extract media session info.");
                    }
                }
                cursorD.close();
                aguc.a(cursorD, null);
                arrayList = arrayList2;
            } finally {
            }
        }
        return arrayList == null ? agrd.a : arrayList;
    }

    public final void b(String str, Bundle bundle) {
        try {
            if (this.d.call(c, str, (String) null, bundle) == null) {
                ((zdv) a.d().q("com/google/android/apps/tvsearch/media/control/KidsModeMediaControllerImpl", "callLauncherxToExecuteMediaControl", 164, "KidsModeMediaControllerImpl.kt")).u("method is not implemented in KidsModeMediaControl content provider.");
            }
        } catch (InterruptedException e) {
            ((zdv) ((zdv) a.d()).p(e).q("com/google/android/apps/tvsearch/media/control/KidsModeMediaControllerImpl", "callLauncherxToExecuteMediaControl", 175, "KidsModeMediaControllerImpl.kt")).u("Failed to perform method call via KidsModeMediaControl content provider.");
        } catch (SecurityException e2) {
            ((zdv) ((zdv) a.d()).p(e2).q("com/google/android/apps/tvsearch/media/control/KidsModeMediaControllerImpl", "callLauncherxToExecuteMediaControl", 180, "KidsModeMediaControllerImpl.kt")).u("Failed to perform method call via KidsModeMediaControl content provider.");
        } catch (UnsupportedOperationException e3) {
            ((zdv) ((zdv) a.d()).p(e3).q("com/google/android/apps/tvsearch/media/control/KidsModeMediaControllerImpl", "callLauncherxToExecuteMediaControl", 185, "KidsModeMediaControllerImpl.kt")).u("Failed to perform method call via KidsModeMediaControl content provider.");
        } catch (ExecutionException e4) {
            ((zdv) ((zdv) a.d()).p(e4).q("com/google/android/apps/tvsearch/media/control/KidsModeMediaControllerImpl", "callLauncherxToExecuteMediaControl", 170, "KidsModeMediaControllerImpl.kt")).u("Failed to perform method call via KidsModeMediaControl content provider.");
        }
    }
}
