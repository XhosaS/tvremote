package defpackage;

import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
@Deprecated
/* loaded from: classes.dex */
public final class dt implements Parcelable {
    public static final Parcelable.Creator<dt> CREATOR = new av(5);
    public final CharSequence a;
    public final CharSequence b;
    public final Bitmap c;
    public final Uri d;
    private final String e;
    private final CharSequence f;
    private final Bundle g;
    private final Uri h;
    private MediaDescription i;

    public dt(String str, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, Bitmap bitmap, Uri uri, Bundle bundle, Uri uri2) {
        this.e = str;
        this.a = charSequence;
        this.b = charSequence2;
        this.f = charSequence3;
        this.c = bitmap;
        this.d = uri;
        this.g = bundle;
        this.h = uri2;
    }

    public static dt a(Object obj) {
        Bundle bundle;
        if (obj == null) {
            return null;
        }
        MediaDescription mediaDescription = (MediaDescription) obj;
        String mediaId = mediaDescription.getMediaId();
        CharSequence title = mediaDescription.getTitle();
        CharSequence subtitle = mediaDescription.getSubtitle();
        CharSequence description = mediaDescription.getDescription();
        Bitmap iconBitmap = mediaDescription.getIconBitmap();
        Uri iconUri = mediaDescription.getIconUri();
        Bundle bundleA = eu.a(mediaDescription.getExtras());
        if (bundleA != null) {
            bundleA = new Bundle(bundleA);
        }
        Uri mediaUri = bundleA != null ? (Uri) bundleA.getParcelable("android.support.v4.media.description.MEDIA_URI") : null;
        if (mediaUri == null) {
            bundle = bundleA;
        } else if (bundleA.containsKey("android.support.v4.media.description.NULL_BUNDLE_FLAG") && bundleA.size() == 2) {
            bundle = null;
        } else {
            bundleA.remove("android.support.v4.media.description.MEDIA_URI");
            bundleA.remove("android.support.v4.media.description.NULL_BUNDLE_FLAG");
            bundle = bundleA;
        }
        if (mediaUri == null) {
            mediaUri = mediaDescription.getMediaUri();
        }
        dt dtVar = new dt(mediaId, title, subtitle, description, iconBitmap, iconUri, bundle, mediaUri);
        dtVar.i = mediaDescription;
        return dtVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return ((Object) this.a) + ", " + ((Object) this.b) + ", " + ((Object) this.f);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        MediaDescription mediaDescriptionBuild = this.i;
        if (mediaDescriptionBuild == null) {
            MediaDescription.Builder builder = new MediaDescription.Builder();
            builder.setMediaId(this.e);
            builder.setTitle(this.a);
            builder.setSubtitle(this.b);
            builder.setDescription(this.f);
            builder.setIconBitmap(this.c);
            builder.setIconUri(this.d);
            builder.setExtras(this.g);
            builder.setMediaUri(this.h);
            mediaDescriptionBuild = builder.build();
            this.i = mediaDescriptionBuild;
        }
        mediaDescriptionBuild.writeToParcel(parcel, i);
    }
}
