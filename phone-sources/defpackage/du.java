package defpackage;

import android.graphics.Bitmap;
import android.media.MediaMetadata;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;

/* compiled from: PG */
@Deprecated
/* loaded from: classes.dex */
public final class du implements Parcelable {
    public static final Parcelable.Creator<du> CREATOR;
    public static final ir a;
    private static final String[] d;
    private static final String[] e;
    private static final String[] f;
    public final Bundle b;
    public MediaMetadata c;
    private dt g;

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
        d = new String[]{"android.media.metadata.TITLE", "android.media.metadata.ARTIST", "android.media.metadata.ALBUM", "android.media.metadata.ALBUM_ARTIST", "android.media.metadata.WRITER", "android.media.metadata.AUTHOR", "android.media.metadata.COMPOSER"};
        e = new String[]{"android.media.metadata.DISPLAY_ICON", "android.media.metadata.ART", "android.media.metadata.ALBUM_ART"};
        f = new String[]{"android.media.metadata.DISPLAY_ICON_URI", "android.media.metadata.ART_URI", "android.media.metadata.ALBUM_ART_URI"};
        CREATOR = new av(6);
    }

    public du(Bundle bundle) {
        Bundle bundle2 = new Bundle(bundle);
        this.b = bundle2;
        eu.c(bundle2);
    }

    public static du c(Object obj) {
        if (obj == null) {
            return null;
        }
        Parcel parcelObtain = Parcel.obtain();
        MediaMetadata mediaMetadata = (MediaMetadata) obj;
        mediaMetadata.writeToParcel(parcelObtain, 0);
        parcelObtain.setDataPosition(0);
        du duVarCreateFromParcel = CREATOR.createFromParcel(parcelObtain);
        parcelObtain.recycle();
        duVarCreateFromParcel.c = mediaMetadata;
        return duVarCreateFromParcel;
    }

    public final long a(String str) {
        return this.b.getLong(str, 0L);
    }

    public final dt b() {
        Bitmap bitmap;
        Uri uri;
        dt dtVar = this.g;
        if (dtVar != null) {
            return dtVar;
        }
        String strE = e("android.media.metadata.MEDIA_ID");
        CharSequence[] charSequenceArr = new CharSequence[3];
        CharSequence charSequenceD = d("android.media.metadata.DISPLAY_TITLE");
        if (TextUtils.isEmpty(charSequenceD)) {
            int i = 0;
            int i2 = 0;
            while (i < 3) {
                String[] strArr = d;
                int length = strArr.length;
                if (i2 >= 7) {
                    break;
                }
                int i3 = i2 + 1;
                CharSequence charSequenceD2 = d(strArr[i2]);
                if (!TextUtils.isEmpty(charSequenceD2)) {
                    charSequenceArr[i] = charSequenceD2;
                    i++;
                }
                i2 = i3;
            }
        } else {
            charSequenceArr[0] = charSequenceD;
            charSequenceArr[1] = d("android.media.metadata.DISPLAY_SUBTITLE");
            charSequenceArr[2] = d("android.media.metadata.DISPLAY_DESCRIPTION");
        }
        int i4 = 0;
        while (true) {
            String[] strArr2 = e;
            int length2 = strArr2.length;
            if (i4 >= 3) {
                bitmap = null;
                break;
            }
            try {
                bitmap = (Bitmap) this.b.getParcelable(strArr2[i4]);
            } catch (Exception e2) {
                Log.w("MediaMetadata", "Failed to retrieve a key as Bitmap.", e2);
                bitmap = null;
            }
            if (bitmap != null) {
                break;
            }
            i4++;
        }
        int i5 = 0;
        while (true) {
            String[] strArr3 = f;
            int length3 = strArr3.length;
            if (i5 >= 3) {
                uri = null;
                break;
            }
            String strE2 = e(strArr3[i5]);
            if (!TextUtils.isEmpty(strE2)) {
                uri = Uri.parse(strE2);
                break;
            }
            i5++;
        }
        String strE3 = e("android.media.metadata.MEDIA_URI");
        Uri uri2 = !TextUtils.isEmpty(strE3) ? Uri.parse(strE3) : null;
        CharSequence charSequence = charSequenceArr[0];
        CharSequence charSequence2 = charSequenceArr[1];
        CharSequence charSequence3 = charSequenceArr[2];
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.b;
        if (bundle2.containsKey("android.media.metadata.BT_FOLDER_TYPE")) {
            bundle.putLong("android.media.extra.BT_FOLDER_TYPE", a("android.media.metadata.BT_FOLDER_TYPE"));
        }
        if (bundle2.containsKey("android.media.metadata.DOWNLOAD_STATUS")) {
            bundle.putLong("android.media.extra.DOWNLOAD_STATUS", a("android.media.metadata.DOWNLOAD_STATUS"));
        }
        dt dtVar2 = new dt(strE, charSequence, charSequence2, charSequence3, bitmap, uri, true != bundle.isEmpty() ? bundle : null, uri2);
        this.g = dtVar2;
        return dtVar2;
    }

    public final CharSequence d(String str) {
        return this.b.getCharSequence(str);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e(String str) {
        CharSequence charSequence = this.b.getCharSequence(str);
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeBundle(this.b);
    }

    public du(Parcel parcel) {
        this.b = parcel.readBundle(eu.class.getClassLoader());
    }
}
