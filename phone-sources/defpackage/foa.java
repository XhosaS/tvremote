package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.os.IBinder;
import android.os.RemoteException;
import android.os.ResultReceiver;
import android.widget.ImageView;
import androidx.media3.ui.PlayerView;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class foa implements Runnable {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public foa(gsd gsdVar, guw guwVar, int i) {
        this.c = i;
        this.b = gsdVar;
        this.a = guwVar;
    }

    /* JADX WARN: Type inference failed for: r0v57, types: [fpg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v59, types: [fnk, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v69, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r0v73, types: [cuh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v86, types: [java.lang.Iterable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v18, types: [java.lang.Object, uhp] */
    @Override // java.lang.Runnable
    public final void run() {
        float f;
        ecb ecbVarR;
        ebh ebhVarP;
        int i = 1;
        switch (this.c) {
            case 0:
                ((foo) this.a).x.Q((fnw) this.b, Integer.MIN_VALUE);
                return;
            case 1:
                ((foo) this.a).x.z((fnw) this.b, Integer.MIN_VALUE);
                return;
            case 2:
                ((foo) this.a).x.T((fnw) this.b, Integer.MIN_VALUE);
                return;
            case 3:
                ((foo) this.a).x.L((fnw) this.b, Integer.MIN_VALUE);
                return;
            case 4:
                ((foo) this.a).x.J((fnw) this.b, Integer.MIN_VALUE);
                return;
            case 5:
                ((foo) this.a).x.ar((fnw) this.b, Integer.MIN_VALUE);
                return;
            case 6:
                Object obj = this.a;
                foo fooVar = (foo) this.b;
                fqt fqtVar = (fqt) obj;
                fooVar.q = fqtVar;
                fom fomVar = new fom(fooVar, fqtVar);
                fqtVar.aC();
                dzg dzgVar = (dzg) obj;
                dzf dzfVar = new dzf(dzgVar, fomVar);
                eao eaoVar = dzgVar.a;
                eaoVar.S(dzfVar);
                fooVar.r = fomVar;
                fooVar.j(new fof(obj, i));
                ((frx) fooVar.g.d.b).a.setActive(true);
                eah eahVarK = dzgVar.K();
                fqz fqzVarAx = fqtVar.ax();
                ean eanVarAv = fqtVar.av();
                ean eanVarAv2 = fqtVar.av();
                eai eaiVarL = dzgVar.L();
                int iBh = dzgVar.bh();
                boolean zAm = dzgVar.am();
                fqtVar.aC();
                ebo eboVarQ = eaoVar.Q();
                eay eayVarAw = fqtVar.aw();
                eab eabVarAu = fqtVar.au();
                if (dzgVar.q(22)) {
                    fqtVar.aC();
                    eiz eizVar = (eiz) eaoVar;
                    eizVar.aG();
                    f = eizVar.w;
                } else {
                    f = 1.0f;
                }
                float f2 = f;
                dyo dyoVarAp = fqtVar.ap();
                if (dzgVar.q(28)) {
                    fqtVar.aC();
                    ecbVarR = eaoVar.R();
                } else {
                    ecbVarR = ecb.a;
                }
                ecb ecbVar = ecbVarR;
                dyx dyxVarAq = fqtVar.aq();
                if (dzgVar.q(23)) {
                    fqtVar.aC();
                    ((eiz) eaoVar).aG();
                }
                if (dzgVar.q(23)) {
                    fqtVar.aC();
                    ((eiz) eaoVar).aG();
                }
                boolean zAl = dzgVar.al();
                int iBg = dzgVar.bg();
                int iBf = dzgVar.bf();
                boolean zU = dzgVar.u();
                boolean zAD = fqtVar.aD();
                eab eabVarAt = fqtVar.at();
                fqtVar.aC();
                long jG = eaoVar.G();
                fqtVar.aC();
                long jH = eaoVar.H();
                fqtVar.aC();
                long jF = eaoVar.F();
                if (dzgVar.q(30)) {
                    fqtVar.aC();
                    ebhVarP = eaoVar.P();
                } else {
                    ebhVarP = ebh.a;
                }
                fqtVar.aC();
                fooVar.p = new fqr(eahVarK, 0, fqzVarAx, eanVarAv, eanVarAv2, 0, eaiVarL, iBh, zAm, eboVarQ, eayVarAw, 0, eabVarAu, f2, dyoVarAp, ecbVar, dyxVarAq, zAl, 1, iBg, iBf, zU, zAD, eabVarAt, jG, jH, jF, ebhVarP, eaoVar.O());
                fooVar.l(dzgVar.M());
                return;
            case 7:
                Object obj2 = this.a;
                fph fphVar = (fph) this.b;
                fphVar.d.i(fphVar.b((fqt) obj2));
                dzg dzgVar2 = (dzg) obj2;
                fphVar.c.E(dzgVar2.M().d(17) ? dzgVar2.N() : eay.a);
                return;
            case 8:
                fph.e(this.a, (ResultReceiver) this.b);
                return;
            case 9:
                Object obj3 = this.a;
                fph fphVar2 = (fph) this.b;
                fphVar2.d.i(fphVar2.b((fqt) obj3));
                return;
            case 10:
                Object obj4 = this.b;
                try {
                    this.a.a((fnw) obj4);
                    return;
                } catch (RemoteException e) {
                    edb.f("MediaSessionLegacyStub", "Exception in ".concat(obj4.toString()), e);
                    return;
                }
            case 11:
                ?? r0 = this.b;
                Object obj5 = this.a;
                IBinder iBinderAsBinder = r0.asBinder();
                iom iomVar = ((fnl) obj5).d;
                fnw fnwVarJ = iomVar.j(iBinderAsBinder);
                if (fnwVarJ != null) {
                    iomVar.q(fnwVarJ);
                    return;
                }
                return;
            case 12:
                foo fooVar2 = (foo) this.a;
                if (fooVar2.s()) {
                    return;
                }
                fki.s(fooVar2.q, (fnx) this.b);
                return;
            case 13:
                ((fnl) this.b).d.p((fnw) this.a);
                return;
            case 14:
                PlayerView playerView = (PlayerView) this.a;
                BitmapDrawable bitmapDrawable = new BitmapDrawable(playerView.getResources(), (Bitmap) this.b);
                ImageView imageView = playerView.b;
                if (imageView != null) {
                    imageView.setImageDrawable(bitmapDrawable);
                    playerView.t();
                }
                if (playerView.v()) {
                    return;
                }
                playerView.l();
                playerView.b();
                return;
            case 15:
                Object obj6 = this.b;
                try {
                    this.a.run();
                    return;
                } finally {
                    ((gfj) obj6).a();
                }
            case 16:
                ((gog) this.a).b.accept(this.b);
                return;
            case 17:
                Object obj7 = this.a;
                Object obj8 = this.b;
                synchronized (((gqr) obj8).i) {
                    Iterator it = ((gqr) obj8).h.iterator();
                    while (it.hasNext()) {
                        ((gqg) it.next()).a((gun) obj7, false);
                    }
                }
                return;
            case 18:
                gpn.b();
                int i2 = gsd.d;
                guw guwVar = (guw) this.a;
                String str = guwVar.b;
                ((gsd) this.b).a.c(guwVar);
                return;
            case 19:
                ((fse) ((gsf) this.a).e).M((cb) this.b, 3);
                return;
            default:
                Iterator it2 = this.a.iterator();
                while (it2.hasNext()) {
                    ((kmf) it2.next()).d(((gtr) this.b).d);
                }
                return;
        }
    }

    public /* synthetic */ foa(Object obj, Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    public /* synthetic */ foa(Object obj, Object obj2, int i, byte[] bArr) {
        this.c = i;
        this.b = obj;
        this.a = obj2;
    }
}
