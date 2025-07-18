package defpackage;

import android.graphics.SurfaceTexture;
import android.net.Uri;
import android.os.Looper;
import android.view.Surface;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class eoy implements Runnable {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ eoy(Object obj, Object obj2, int i) {
        this.c = i;
        this.b = obj;
        this.a = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [eoz, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v18, types: [fef, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v25, types: [fcf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v29, types: [fcf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v3, types: [eoz, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4, types: [eoz, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v5, types: [eoz, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v30, types: [ecq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v35, types: [fcf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v39, types: [fcf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v42, types: [fcf, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.c) {
            case 0:
                this.b.cZ(0, (evz) ((eph) this.a).c);
                break;
            case 1:
                Object obj = this.b;
                eot eotVar = (eot) obj;
                eou eouVar = eotVar.c;
                if (eouVar.e != 0 && !eotVar.b) {
                    Object obj2 = this.a;
                    Looper looper = eouVar.h;
                    looper.getClass();
                    eotVar.a = eouVar.h(looper, eotVar.d, (dze) obj2, false);
                    eouVar.c.add(obj);
                    break;
                }
                break;
            case 2:
                this.b.da(0, (evz) ((eph) this.a).c);
                break;
            case 3:
                this.b.cY(0, (evz) ((eph) this.a).c);
                break;
            case 4:
                this.b.g(0, (evz) ((eph) this.a).c);
                break;
            case 5:
                ((eqt) this.b).C.a(((eqm) this.a).c);
                break;
            case 6:
                era eraVar = (era) this.b;
                eraVar.f = false;
                eraVar.f((Uri) this.a);
                break;
            case 7:
                etx etxVar = (etx) this.a;
                jdq jdqVar = etxVar.m;
                jdqVar.getClass();
                Object obj3 = this.b;
                obj3.getClass();
                ((tug) ((tug) jdr.a.f()).i((Throwable) obj3).j("com/google/android/apps/googletv/app/player/offline/OfflineControllerImpl$prepareDownloadHelper$1", "onPrepareError", 253, "OfflineControllerImpl.kt")).v("Download preparation failed for assetId: %s", jdqVar.d.b);
                etxVar.b();
                break;
            case 8:
                euc eucVar = ((eui) this.a).a;
                ((euk) this.b).k(eucVar.l);
                break;
            case 9:
                this.a.a(this.b);
                break;
            case 10:
                ((ewp) this.a).x(this.b);
                break;
            case 11:
                String str = edt.a;
                ((epm) this.b).b.cS((ebo) this.a);
                break;
            case 12:
                String str2 = edt.a;
                ((epm) this.a).b.cU();
                break;
            case 13:
                String str3 = edt.a;
                ((epm) this.b).b.cW();
                break;
            case 14:
                ehw ehwVar = (ehw) this.a;
                ehwVar.a();
                String str4 = edt.a;
                ((epm) this.b).b.cP(ehwVar);
                break;
            case 15:
                String str5 = edt.a;
                ((epm) this.a).b.cO((String) this.b);
                break;
            case 16:
                fcs fcsVar = (fcs) this.b;
                SurfaceTexture surfaceTexture = fcsVar.d;
                Surface surface = fcsVar.e;
                SurfaceTexture surfaceTexture2 = (SurfaceTexture) this.a;
                Surface surface2 = new Surface(surfaceTexture2);
                fcsVar.d = surfaceTexture2;
                fcsVar.e = surface2;
                Iterator it = fcsVar.a.iterator();
                while (it.hasNext()) {
                    ((eiw) it.next()).a.aC(surface2);
                }
                fcs.a(surfaceTexture, surface);
                break;
            case 17:
                foo fooVar = (foo) this.b;
                if (!fooVar.s()) {
                    fooVar.b((fnw) this.a);
                    break;
                }
                break;
            case 18:
                ((foo) this.b).x.z((fnw) this.a, Integer.MIN_VALUE);
                break;
            case 19:
                ((foo) this.b).x.B((fnw) this.a, Integer.MIN_VALUE);
                break;
            default:
                ((foo) this.b).x.B((fnw) this.a, Integer.MIN_VALUE);
                break;
        }
    }

    public /* synthetic */ eoy(Object obj, Object obj2, int i, byte[] bArr) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }
}
