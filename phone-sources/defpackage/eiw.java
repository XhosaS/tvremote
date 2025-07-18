package defpackage;

import android.graphics.SurfaceTexture;
import android.os.Looper;
import android.view.SurfaceHolder;
import android.view.TextureView;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eiw implements SurfaceHolder.Callback, TextureView.SurfaceTextureListener, fcf, els, eyf, etj {
    public static final /* synthetic */ int b = 0;
    public final /* synthetic */ eiz a;

    public eiw(eiz eizVar) {
        this.a = eizVar;
    }

    @Override // defpackage.els
    public final void a(String str) {
        ele eleVar = this.a.G;
        ekl eklVarK = eleVar.K();
        eleVar.N(eklVarK, 1012, new ekn((Object) eklVarK, (Object) str, 0));
    }

    @Override // defpackage.els
    public final void b(dze dzeVar, ehx ehxVar) {
        ele eleVar = this.a.G;
        ekl eklVarK = eleVar.K();
        eleVar.N(eklVarK, 1009, new ekn(eklVarK, (Object) dzeVar, 14));
    }

    @Override // defpackage.els
    public final void c(final long j) {
        ele eleVar = this.a.G;
        final ekl eklVarK = eleVar.K();
        eleVar.N(eklVarK, 1010, new ecw() { // from class: ekt
            @Override // defpackage.ecw
            public final void a(Object obj) {
                ((ekm) obj).c(eklVarK, j);
            }
        });
    }

    @Override // defpackage.eyf
    public final void cK(ecb ecbVar) {
        eiz eizVar = this.a;
        eizVar.y = ecbVar;
        eizVar.H.h(27, new ein(ecbVar, 15));
    }

    @Override // defpackage.eyf
    public final void cL(List list) {
        this.a.H.h(27, new ein(list, 18));
    }

    @Override // defpackage.fcf
    public final void cM(int i, long j) {
        ele eleVar = this.a.G;
        ekl eklVarJ = eleVar.J();
        eleVar.N(eklVarJ, 1018, new eis(eklVarJ, i, 5));
    }

    @Override // defpackage.etj
    public final void cN(ead eadVar) {
        eiz eizVar = this.a;
        eaa eaaVar = new eaa(eizVar.C);
        for (int i = 0; i < eadVar.a(); i++) {
            eadVar.b(i).b(eaaVar);
        }
        eizVar.C = new eab(eaaVar);
        eab eabVarAv = eizVar.av();
        if (!eabVarAv.equals(eizVar.p)) {
            eizVar.p = eabVarAv;
            eizVar.H.e(14, new ein(this, 16));
        }
        fvu fvuVar = eizVar.H;
        fvuVar.e(28, new ein(eadVar, 17));
        fvuVar.d();
    }

    @Override // defpackage.fcf
    public final void cO(String str) {
        ele eleVar = this.a.G;
        ekl eklVarK = eleVar.K();
        eleVar.N(eklVarK, 1019, new ekn((Object) eklVarK, (Object) str, 5));
    }

    @Override // defpackage.fcf
    public final void cP(ehw ehwVar) {
        ele eleVar = this.a.G;
        ekl eklVarJ = eleVar.J();
        eleVar.N(eklVarJ, 1020, new ekn(eklVarJ, (Object) ehwVar, 10));
    }

    @Override // defpackage.fcf
    public final void cQ(final long j, final int i) {
        ele eleVar = this.a.G;
        final ekl eklVarJ = eleVar.J();
        eleVar.N(eklVarJ, 1021, new ecw() { // from class: ekx
            @Override // defpackage.ecw
            public final void a(Object obj) {
                ((ekm) obj).K(eklVarJ, j, i);
            }
        });
    }

    @Override // defpackage.fcf
    public final void cR(dze dzeVar, ehx ehxVar) {
        ele eleVar = this.a.G;
        ekl eklVarK = eleVar.K();
        eleVar.N(eklVarK, 1017, new ekn(eklVarK, (Object) dzeVar, 11));
    }

    @Override // defpackage.fcf
    public final void cS(ebo eboVar) {
        eiz eizVar = this.a;
        eizVar.B = eboVar;
        eizVar.H.h(25, new ein(eboVar, 19));
    }

    @Override // defpackage.fcf
    public final void cT(Object obj) {
        eiz eizVar = this.a;
        ele eleVar = eizVar.G;
        ekl eklVarK = eleVar.K();
        eleVar.N(eklVarK, 26, new ekn((Object) eklVarK, obj, 15));
        if (eizVar.r == obj) {
            eizVar.H.h(26, new eit(0));
        }
    }

    @Override // defpackage.fcf
    public final void cU() {
        ele eleVar = this.a.G;
        eleVar.N(eleVar.K(), 1030, new eit(5));
    }

    @Override // defpackage.fcf
    public final void cV(String str, long j) {
        ele eleVar = this.a.G;
        ekl eklVarK = eleVar.K();
        eleVar.N(eklVarK, 1016, new ela(eklVarK, str, j, 0));
    }

    @Override // defpackage.fcf
    public final void cW() {
        ele eleVar = this.a.G;
        ekl eklVarK = eleVar.K();
        eleVar.N(eklVarK, 1015, new eky(eklVarK, 3));
    }

    @Override // defpackage.els
    public final void d(final int i) {
        final int i2 = 1;
        tsl tslVar = new tsl() { // from class: eiu
            @Override // defpackage.tsl
            public final Object apply(Object obj) {
                if (i2 != 0) {
                    int i3 = i;
                    int i4 = eiw.b;
                    return Integer.valueOf(i3);
                }
                int i5 = i;
                int i6 = eiw.b;
                return Integer.valueOf(i5);
            }
        };
        final byte b2 = 0 == true ? 1 : 0;
        tsl tslVar2 = new tsl() { // from class: eiu
            @Override // defpackage.tsl
            public final Object apply(Object obj) {
                if (b2 != 0) {
                    int i3 = i;
                    int i4 = eiw.b;
                    return Integer.valueOf(i3);
                }
                int i5 = i;
                int i6 = eiw.b;
                return Integer.valueOf(i5);
            }
        };
        eck eckVar = this.a.k;
        a.ab(Looper.myLooper() == eckVar.b.a());
        eckVar.e++;
        eckVar.a.d(new be(eckVar, tslVar2, 19, (byte[]) null));
        eckVar.a(tslVar.apply(eckVar.c));
    }

    @Override // defpackage.els
    public final void e(elt eltVar) {
        ele eleVar = this.a.G;
        ekl eklVarK = eleVar.K();
        eleVar.N(eklVarK, 1031, new ekn((Object) eklVarK, (Object) eltVar, 12));
    }

    @Override // defpackage.els
    public final void f(elt eltVar) {
        ele eleVar = this.a.G;
        ekl eklVarK = eleVar.K();
        eleVar.N(eklVarK, 1032, new ekn((Object) eklVarK, (Object) eltVar, 17));
    }

    @Override // defpackage.els
    public final void g(int i, long j, long j2) {
        ele eleVar = this.a.G;
        ekl eklVarK = eleVar.K();
        eleVar.N(eklVarK, 1011, new ekq(eklVarK, i, j, j2, 0));
    }

    @Override // defpackage.els
    public final void h(boolean z) {
        eiz eizVar = this.a;
        if (eizVar.x == z) {
            return;
        }
        eizVar.x = z;
        eizVar.H.h(23, new eiv(z, 0));
    }

    @Override // defpackage.els
    public final void i() {
        ele eleVar = this.a.G;
        eleVar.N(eleVar.K(), 1029, new eit(12));
    }

    @Override // defpackage.els
    public final void j(String str, long j) {
        ele eleVar = this.a.G;
        ekl eklVarK = eleVar.K();
        eleVar.N(eklVarK, 1008, new ela(eklVarK, str, j, 1));
    }

    @Override // defpackage.els
    public final void k() {
        ele eleVar = this.a.G;
        ekl eklVarJ = eleVar.J();
        eleVar.N(eklVarJ, 1013, new eky(eklVarJ, 1));
    }

    @Override // defpackage.els
    public final void l() {
        ele eleVar = this.a.G;
        ekl eklVarK = eleVar.K();
        eleVar.N(eklVarK, 1007, new ein(eklVarK, 20));
    }

    @Override // defpackage.els
    public final void m() {
        ele eleVar = this.a.G;
        eleVar.N(eleVar.K(), 1014, new eit(13));
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        eiz eizVar = this.a;
        eizVar.aB(surfaceTexture);
        eizVar.ay(i, i2);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        eiz eizVar = this.a;
        eizVar.aC(null);
        eizVar.ay(0, 0);
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        this.a.ay(i, i2);
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        this.a.ay(i2, i3);
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        eiz eizVar = this.a;
        if (eizVar.t) {
            eizVar.aC(surfaceHolder.getSurface());
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        eiz eizVar = this.a;
        if (eizVar.t) {
            eizVar.aC(null);
        }
        eizVar.ay(0, 0);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }
}
