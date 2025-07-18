package defpackage;

import android.media.MediaMetadata;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class frt implements Parcelable {
    public static final Parcelable.Creator<frt> CREATOR;
    public static final ir a;
    public static final String[] b;
    final Bundle c;
    public MediaMetadata d;

    static {
        ir irVar = new ir();
        a = irVar;
        irVar.put("android.media.metadata.TITLE", 1);
        irVar.put("android.media.metadata.ARTIST", 1);
        irVar.put("android.media.metadata.DURATION", 0);
        irVar.put("android.media.metadata.ALBUM", 1);
        irVar.put("android.media.metadata.AUTHOR", 1);
        irVar.put("android.media.metadata.WRITER", 1);
        irVar.put("android.media.metadata.COMPOSER", 1);
        irVar.put("android.media.metadata.COMPILATION", 1);
        irVar.put("android.media.metadata.DATE", 1);
        irVar.put("android.media.metadata.YEAR", 0);
        irVar.put("android.media.metadata.GENRE", 1);
        irVar.put("android.media.metadata.TRACK_NUMBER", 0);
        irVar.put("android.media.metadata.NUM_TRACKS", 0);
        irVar.put("android.media.metadata.DISC_NUMBER", 0);
        irVar.put("android.media.metadata.ALBUM_ARTIST", 1);
        irVar.put("android.media.metadata.ART", 2);
        irVar.put("android.media.metadata.ART_URI", 1);
        irVar.put("android.media.metadata.ALBUM_ART", 2);
        irVar.put("android.media.metadata.ALBUM_ART_URI", 1);
        irVar.put("android.media.metadata.USER_RATING", 3);
        irVar.put("android.media.metadata.RATING", 3);
        irVar.put("android.media.metadata.DISPLAY_TITLE", 1);
        irVar.put("android.media.metadata.DISPLAY_SUBTITLE", 1);
        irVar.put("android.media.metadata.DISPLAY_DESCRIPTION", 1);
        irVar.put("android.media.metadata.DISPLAY_ICON", 2);
        irVar.put("android.media.metadata.DISPLAY_ICON_URI", 1);
        irVar.put("android.media.metadata.MEDIA_ID", 1);
        irVar.put("android.media.metadata.BT_FOLDER_TYPE", 0);
        irVar.put("android.media.metadata.MEDIA_URI", 1);
        irVar.put("android.media.metadata.ADVERTISEMENT", 0);
        irVar.put("android.media.metadata.DOWNLOAD_STATUS", 0);
        b = new String[]{"android.media.metadata.TITLE", "android.media.metadata.ARTIST", "android.media.metadata.ALBUM", "android.media.metadata.ALBUM_ARTIST", "android.media.metadata.WRITER", "android.media.metadata.AUTHOR", "android.media.metadata.COMPOSER", "android.media.metadata.DISPLAY_SUBTITLE", "android.media.metadata.DISPLAY_DESCRIPTION"};
        CREATOR = new dyy(8);
    }

    public frt(Bundle bundle) {
        Bundle bundle2 = new Bundle(bundle);
        this.c = bundle2;
        fse.d(bundle2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeBundle(this.c);
    }

    public frt(Parcel parcel) {
        Bundle bundle = parcel.readBundle(fse.class.getClassLoader());
        bundle.getClass();
        this.c = bundle;
    }
}
