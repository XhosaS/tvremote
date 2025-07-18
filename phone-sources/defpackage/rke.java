package defpackage;

import android.app.ActivityManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import android.util.Pair;
import com.google.common.collect.ImmutableList;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class rke implements tsl {
    private final /* synthetic */ int a;

    public /* synthetic */ rke(int i) {
        this.a = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.tsl
    public final Object apply(Object obj) throws IOException {
        switch (this.a) {
            case 0:
                return null;
            case 1:
                pro proVar = (pro) obj;
                trf trfVarD = trf.d(proVar.d());
                pbb pbbVar = new pbb(proVar, 9);
                ugk ugkVar = ugk.a;
                int i = 4;
                return trf.d(trfVarD.f(pbbVar, ugkVar).e(new prn(2), ugkVar)).b(Exception.class, new pri(i), ugkVar).e(new prn(i), ugkVar);
            case 2:
                InputStream inputStream = (InputStream) obj;
                if (inputStream == null) {
                    return null;
                }
                Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(inputStream);
                try {
                    inputStream.close();
                } catch (IOException unused) {
                }
                return bitmapDecodeStream;
            case 3:
                return ((rjq) obj).a();
            case 4:
                return ((rjq) obj).b();
            case 5:
                int i2 = rku.b;
                ParcelFileDescriptor parcelFileDescriptorB = ((ojf) obj).b();
                if (parcelFileDescriptorB == null) {
                    return null;
                }
                try {
                    ParcelFileDescriptor.AutoCloseInputStream autoCloseInputStream = new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptorB);
                    try {
                        Bitmap bitmapDecodeStream2 = BitmapFactory.decodeStream(autoCloseInputStream);
                        autoCloseInputStream.close();
                        return bitmapDecodeStream2;
                    } finally {
                    }
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            case 6:
                int i3 = rku.b;
                oai oaiVarB = ((oje) obj).b();
                ArrayList arrayList = new ArrayList();
                zxl zxlVar = new zxl(oaiVarB, 1);
                while (zxlVar.hasNext()) {
                    oaj oajVar = (oaj) zxlVar.next();
                    if (!oajVar.a.b()) {
                        arrayList.add(rkv.a.apply(oajVar));
                    }
                }
                return ImmutableList.copyOf((Collection) arrayList);
            case 7:
                return tst.h(((ActivityManager.RunningAppProcessInfo) obj).importanceReasonComponent);
            case 8:
                zbh zbhVar = (zbh) obj;
                vtw vtwVarM = zbe.a.m();
                if (!vtwVarM.b.A()) {
                    vtwVarM.u();
                }
                zbe zbeVar = (zbe) vtwVarM.b;
                zbhVar.getClass();
                zbeVar.d = zbhVar;
                zbeVar.c = 3;
                vtw vtwVarM2 = zbd.a.m();
                if (!vtwVarM2.b.A()) {
                    vtwVarM2.u();
                }
                zbd.c((zbd) vtwVarM2.b);
                zbd zbdVar = (zbd) vtwVarM2.r();
                if (!vtwVarM.b.A()) {
                    vtwVarM.u();
                }
                zbe zbeVar2 = (zbe) vtwVarM.b;
                zbdVar.getClass();
                zbeVar2.e = zbdVar;
                zbeVar2.b |= 1;
                return (zbe) vtwVarM.r();
            case 9:
                zaa zaaVar = (zaa) obj;
                vtw vtwVarM3 = zbe.a.m();
                if (!vtwVarM3.b.A()) {
                    vtwVarM3.u();
                }
                zbe zbeVar3 = (zbe) vtwVarM3.b;
                zaaVar.getClass();
                zbeVar3.d = zaaVar;
                zbeVar3.c = 1;
                vtw vtwVarM4 = zbd.a.m();
                if (!vtwVarM4.b.A()) {
                    vtwVarM4.u();
                }
                zbd.c((zbd) vtwVarM4.b);
                zbd zbdVar2 = (zbd) vtwVarM4.r();
                if (!vtwVarM3.b.A()) {
                    vtwVarM3.u();
                }
                zbe zbeVar4 = (zbe) vtwVarM3.b;
                zbdVar2.getClass();
                zbeVar4.e = zbdVar2;
                zbeVar4.b |= 1;
                return (zbe) vtwVarM3.r();
            case 10:
                return ImmutableList.copyOf((Collection) obj);
            case 11:
                ((tug) ((tug) ((tug) rnb.a.g()).i((RuntimeException) obj)).j("com/google/android/libraries/performance/primes/metrics/memory/MemoryMetricServiceImpl", "record", 418, "MemoryMetricServiceImpl.java")).s("Metric extension provider failed.");
                return null;
            case 12:
                return Integer.valueOf(Integer.parseInt((String) obj));
            case 13:
                return false;
            case 14:
                Log.e("CheckboxChecker", "fetching usage reporting opt-in failed", (Throwable) obj);
                return true;
            case 15:
                return uin.a((String) obj);
            case 16:
                return Integer.valueOf(Log.w("AccountRemovedRecv", "Failed to remove account snapshot: ", (IOException) obj));
            case 17:
                rxh rxhVar = (rxh) obj;
                if (rxhVar.a != 29514) {
                    throw rxhVar;
                }
                vtw vtwVarM5 = rxt.a.m();
                vtw vtwVarM6 = rxq.b.m();
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (!vtwVarM6.b.A()) {
                    vtwVarM6.u();
                }
                rxq rxqVar = (rxq) vtwVarM6.b;
                rxqVar.c |= 8;
                rxqVar.g = jCurrentTimeMillis;
                if (!vtwVarM5.b.A()) {
                    vtwVarM5.u();
                }
                rxt rxtVar = (rxt) vtwVarM5.b;
                rxq rxqVar2 = (rxq) vtwVarM6.r();
                rxqVar2.getClass();
                rxtVar.c = rxqVar2;
                rxtVar.b |= 1;
                return (rxt) vtwVarM5.r();
            case 18:
                Map.Entry entry = (Map.Entry) obj;
                int i4 = tkv.f;
                return Pair.create((String) entry.getKey(), new String((byte[]) entry.getValue()));
            case 19:
                Map.Entry entry2 = (Map.Entry) obj;
                entry2.getClass();
                return new udq(entry2);
            default:
                Map.Entry entry3 = (Map.Entry) obj;
                entry3.getClass();
                return new udu(entry3);
        }
    }
}
