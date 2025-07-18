package defpackage;

import android.os.Build;
import android.os.ParcelFileDescriptor;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder$InternalRewinder;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dbk implements day {
    public final ParcelFileDescriptorRewinder$InternalRewinder a;

    public dbk(ParcelFileDescriptor parcelFileDescriptor) {
        this.a = new ParcelFileDescriptorRewinder$InternalRewinder(parcelFileDescriptor);
    }

    public static boolean c() {
        return !"robolectric".equals(Build.FINGERPRINT);
    }

    @Override // defpackage.day
    public final /* synthetic */ Object a() {
        return this.a.rewind();
    }

    @Override // defpackage.day
    public final void b() {
    }
}
