package defpackage;

import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class frs implements Parcelable {
    public static final Parcelable.Creator<frs> CREATOR = new dyy(7);
    public final String a;
    public final CharSequence b;
    public final CharSequence c;
    public final CharSequence d;
    public final Bitmap e;
    public final Uri f;
    public final Bundle g;
    public final Uri h;
    private MediaDescription i;

    public frs(String str, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, Bitmap bitmap, Uri uri, Bundle bundle, Uri uri2) {
        this.a = str;
        this.b = charSequence;
        this.c = charSequence2;
        this.d = charSequence3;
        this.e = bitmap;
        this.f = uri;
        this.g = bundle;
        this.h = uri2;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0050  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static defpackage.frs b(android.media.MediaDescription r13) {
        /*
            java.lang.String r1 = r13.getMediaId()
            java.lang.CharSequence r2 = r13.getTitle()
            java.lang.CharSequence r3 = r13.getSubtitle()
            java.lang.CharSequence r4 = r13.getDescription()
            android.graphics.Bitmap r5 = r13.getIconBitmap()
            android.net.Uri r6 = r13.getIconUri()
            android.os.Bundle r0 = r13.getExtras()
            android.os.Bundle r0 = defpackage.fse.a(r0)
            if (r0 == 0) goto L28
            android.os.Bundle r7 = new android.os.Bundle
            r7.<init>(r0)
            r0 = r7
        L28:
            r7 = 0
            if (r0 == 0) goto L4c
            java.lang.String r8 = "android.support.v4.media.description.MEDIA_URI"
            android.os.Parcelable r9 = r0.getParcelable(r8)
            android.net.Uri r9 = (android.net.Uri) r9
            if (r9 == 0) goto L4d
            java.lang.String r10 = "android.support.v4.media.description.NULL_BUNDLE_FLAG"
            boolean r11 = r0.containsKey(r10)
            if (r11 == 0) goto L45
            int r11 = r0.size()
            r12 = 2
            if (r11 != r12) goto L45
            goto L4e
        L45:
            r0.remove(r8)
            r0.remove(r10)
            goto L4d
        L4c:
            r9 = r7
        L4d:
            r7 = r0
        L4e:
            if (r9 != 0) goto L54
            android.net.Uri r9 = r13.getMediaUri()
        L54:
            r8 = r9
            frs r0 = new frs
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r0.i = r13
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.frs.b(android.media.MediaDescription):frs");
    }

    public final MediaDescription a() {
        MediaDescription mediaDescription = this.i;
        if (mediaDescription != null) {
            return mediaDescription;
        }
        MediaDescription.Builder builder = new MediaDescription.Builder();
        builder.setMediaId(this.a);
        builder.setTitle(this.b);
        builder.setSubtitle(this.c);
        builder.setDescription(this.d);
        builder.setIconBitmap(this.e);
        builder.setIconUri(this.f);
        builder.setExtras(this.g);
        builder.setMediaUri(this.h);
        MediaDescription mediaDescriptionBuild = builder.build();
        this.i = mediaDescriptionBuild;
        return mediaDescriptionBuild;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        CharSequence charSequence = this.d;
        CharSequence charSequence2 = this.c;
        return String.valueOf(this.b) + ", " + String.valueOf(charSequence2) + ", " + String.valueOf(charSequence);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        a().writeToParcel(parcel, i);
    }
}
