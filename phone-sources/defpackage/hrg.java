package defpackage;

import android.graphics.ImageDecoder;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hrg implements hln {
    private final /* synthetic */ int a;
    private final Object b;

    public hrg(int i) {
        this.a = i;
        this.b = new hre();
    }

    /* JADX WARN: Type inference failed for: r10v7, types: [hod, java.lang.Object] */
    @Override // defpackage.hln
    public final /* synthetic */ hnv a(Object obj, int i, int i2, hll hllVar) {
        int i3 = this.a;
        if (i3 == 0) {
            return ((hre) this.b).c(ImageDecoder.createSource((ByteBuffer) obj), i, i2, hllVar);
        }
        if (i3 == 1) {
            hrx hrxVar = (hrx) this.b;
            return hrxVar.a(new hsh((ByteBuffer) obj, hrxVar.f, hrxVar.g, 1), i, i2, hllVar, hrx.e);
        }
        if (i3 == 2) {
            return ((hre) this.b).c(ImageDecoder.createSource(hwc.a((InputStream) obj)), i, i2, hllVar);
        }
        if (i3 != 3) {
            return i3 != 4 ? i3 != 5 ? hsj.g(((hkq) obj).a(), this.b) : fse.E(ImageDecoder.createSource(hwc.a((InputStream) obj)), i, i2, hllVar) : fse.E(ImageDecoder.createSource((ByteBuffer) obj), i, i2, hllVar);
        }
        hrx hrxVar2 = (hrx) this.b;
        return hrxVar2.a(new hsh((ParcelFileDescriptor) obj, hrxVar2.f, hrxVar2.g, 2), i, i2, hllVar, hrx.e);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v8, types: [java.lang.Object, java.util.List] */
    @Override // defpackage.hln
    public final /* synthetic */ boolean b(Object obj, hll hllVar) {
        int i = this.a;
        if (i == 0) {
            return true;
        }
        if (i == 1) {
            return true;
        }
        if (i == 2) {
            return true;
        }
        if (i == 3) {
            return (!("HUAWEI".equalsIgnoreCase(Build.MANUFACTURER) || "HONOR".equalsIgnoreCase(Build.MANUFACTURER)) || ((ParcelFileDescriptor) obj).getStatSize() <= 536870912) && hmi.d();
        }
        if (i == 4) {
            return fse.F(hju.b(((fse) this.b).b, (ByteBuffer) obj));
        }
        if (i != 5) {
            return true;
        }
        fse fseVar = (fse) this.b;
        return fse.F(hju.f(fseVar.b, (InputStream) obj, (hok) fseVar.a));
    }

    public hrg(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }
}
