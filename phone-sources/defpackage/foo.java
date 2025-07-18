package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.os.RemoteException;
import android.os.SystemClock;
import com.google.common.collect.ImmutableList;
import j$.util.Objects;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.ExecutionException;

/* compiled from: PG */
/* loaded from: classes.dex */
public class foo {
    public static final /* synthetic */ int y = 0;
    private static final fra z = new fra(1);
    private final Runnable A;
    private final boolean B;
    private final long C;
    public final Object a = new Object();
    public final Uri b;
    public final foi c;
    public final foh d;
    public final fnt e;
    public final Context f;
    public final fph g;
    public final String h;
    public final frc i;
    public final fny j;
    public final Handler k;
    public final ecl l;
    public final Handler m;
    public final boolean n;
    public final ImmutableList o;
    public fqr p;
    public fqt q;
    public fom r;
    public boolean s;
    public boolean t;
    public final ImmutableList u;
    public final ImmutableList v;
    public final Bundle w;
    public final fnl x;

    public foo(fny fnyVar, Context context, String str, eao eaoVar, ImmutableList immutableList, ImmutableList immutableList2, ImmutableList immutableList3, fnt fntVar, Bundle bundle, Bundle bundle2, ecl eclVar) {
        edb.h("Init " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.8.0-alpha01] [" + edt.a + "]");
        this.j = fnyVar;
        this.f = context;
        this.h = str;
        this.u = immutableList;
        this.v = immutableList2;
        this.o = immutableList3;
        this.e = fntVar;
        this.w = bundle2;
        this.l = eclVar;
        this.n = true;
        this.B = true;
        fnl fnlVar = new fnl(this);
        this.x = fnlVar;
        this.m = new Handler(Looper.getMainLooper());
        Looper looper = ((eiz) eaoVar).h;
        Handler handler = new Handler(looper);
        this.k = handler;
        this.p = fqr.a;
        this.c = new foi(this, looper);
        this.d = new foh(this, looper);
        Uri uriBuild = new Uri.Builder().scheme(foo.class.getName()).appendPath(str).appendPath(String.valueOf(SystemClock.elapsedRealtime())).build();
        this.b = uriBuild;
        fnu fnuVar = new fnu(fnyVar instanceof fnp ? fnu.b : fnu.a, fnu.c, null, null);
        fph fphVar = new fph(this, uriBuild, handler, bundle, immutableList, immutableList2, fnuVar.d, fnuVar.e, bundle2);
        this.g = fphVar;
        this.i = new frc(Process.myUid(), context.getPackageName(), fnlVar, bundle, fphVar.d.b().b);
        fqt fqtVar = new fqt(eaoVar);
        this.q = fqtVar;
        edt.aB(handler, new foa(this, fqtVar, 6, null));
        this.C = 3000L;
        this.A = new foe(this, 0);
        edt.aB(handler, new foe(this, 2));
    }

    private final void A(fnw fnwVar) {
        this.x.d.q(fnwVar);
    }

    protected static final boolean v(fnw fnwVar) {
        return fnwVar != null && fnwVar.b == 0 && Objects.equals(fnwVar.a(), "com.android.systemui");
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected void a(fon fonVar) {
        ImmutableList immutableListL = this.x.d.l();
        for (int i = 0; i < immutableListL.size(); i++) {
            k((fnw) immutableListL.get(i), fonVar);
        }
        try {
            fonVar.a(this.g.c, 0);
        } catch (RemoteException e) {
            edb.d("MediaSessionImpl", "Exception in using media1 API", e);
        }
    }

    public void b(fnw fnwVar) {
        if (this.t) {
            if (v(fnwVar)) {
                return;
            }
            if (r(fnwVar)) {
                this.t = false;
            }
        }
        this.e.b();
    }

    public boolean c(fnw fnwVar) {
        return this.x.d.r(fnwVar) || this.g.n.r(fnwVar);
    }

    public final fnu d(fnw fnwVar) {
        byte b = 0;
        if (this.t && v(fnwVar)) {
            fph fphVar = this.g;
            fqx fqxVar = fnu.a;
            fqx fqxVar2 = fphVar.k;
            fqxVar2.getClass();
            eak eakVar = fphVar.l;
            eakVar.getClass();
            ImmutableList immutableList = fphVar.i;
            ImmutableList immutableListCopyOf = immutableList == null ? null : ImmutableList.copyOf((Collection) immutableList);
            ImmutableList immutableList2 = fphVar.j;
            return new fnu(fqxVar2, eakVar, immutableListCopyOf, immutableList2 != null ? ImmutableList.copyOf((Collection) immutableList2) : null);
        }
        fnt fntVar = this.e;
        fny fnyVar = this.j;
        fnu fnuVarH = fntVar.h(fnyVar);
        if (r(fnwVar)) {
            this.t = true;
            ImmutableList immutableList3 = fnuVarH.g;
            if (immutableList3 == null) {
                immutableList3 = fnyVar.a.v;
            }
            if (immutableList3.isEmpty()) {
                fph fphVar2 = this.g;
                ImmutableList immutableList4 = fnuVarH.f;
                if (immutableList4 == null) {
                    immutableList4 = fnyVar.a.u;
                }
                fphVar2.i = immutableList4;
            } else {
                fph fphVar3 = this.g;
                fphVar3.j = immutableList3;
                Bundle bundle = fphVar3.h;
                boolean z2 = bundle.getBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_PREVIOUS", false);
                boolean z3 = bundle.getBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_NEXT", false);
                fphVar3.F();
                if (bundle.getBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_PREVIOUS", false) != z2 || bundle.getBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_NEXT", false) != z3) {
                    fphVar3.d.f(bundle);
                }
            }
            fph fphVar4 = this.g;
            fqx fqxVar3 = fnuVarH.d;
            eak eakVar2 = fnuVarH.e;
            if (fphVar4.m == null) {
                boolean zD = fphVar4.l.d(17);
                boolean zD2 = eakVar2.d(17);
                fphVar4.k = fqxVar3;
                fphVar4.l = eakVar2;
                if (!fphVar4.j.isEmpty()) {
                    Bundle bundle2 = fphVar4.h;
                    boolean z4 = bundle2.getBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_PREVIOUS", false);
                    boolean z5 = bundle2.getBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_NEXT", false);
                    fphVar4.F();
                    if (bundle2.getBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_PREVIOUS", false) != z4 || bundle2.getBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_NEXT", false) != z5) {
                        fphVar4.d.f(bundle2);
                    }
                }
                if (zD != zD2) {
                    foo fooVar = fphVar4.b;
                    edt.aB(fooVar.k, new foa(fphVar4, fooVar.q, 7, b == true ? 1 : 0));
                    return fnuVarH;
                }
                fphVar4.G(fphVar4.b.q);
            }
        }
        return fnuVarH;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final fnw e() {
        ImmutableList immutableListL = this.x.d.l();
        for (int i = 0; i < immutableListL.size(); i++) {
            fnw fnwVar = (fnw) immutableListL.get(i);
            if (r(fnwVar)) {
                return fnwVar;
            }
        }
        return null;
    }

    protected final fnw f(fnw fnwVar) {
        if (!this.t || !v(fnwVar)) {
            return fnwVar;
        }
        fnw fnwVarE = e();
        fnwVarE.getClass();
        return fnwVarE;
    }

    protected final uhp g(fnw fnwVar, List list) {
        f(fnwVar);
        return this.e.g(list);
    }

    protected final uhp h(fnw fnwVar, List list, int i, long j) {
        return this.e.a(this.j, f(fnwVar), list, i, j);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void i(fqr fqrVar, boolean z2, boolean z3) {
        boolean z4;
        boolean z5;
        int iA;
        eak eakVar;
        fnl fnlVar = this.x;
        fqr fqrVarB = fnlVar.b(fqrVar);
        iom iomVar = fnlVar.d;
        ImmutableList immutableListL = iomVar.l();
        int i = 0;
        while (i < immutableListL.size()) {
            fnw fnwVar = (fnw) immutableListL.get(i);
            try {
                fqv fqvVarK = iomVar.k(fnwVar);
                if (fqvVarK != null) {
                    iA = fqvVarK.a();
                } else if (!c(fnwVar)) {
                    return;
                } else {
                    iA = 0;
                }
                synchronized (iomVar.a) {
                    try {
                        if (((fnf) ((ko) iomVar.d).get(fnwVar)) != null) {
                        }
                    } finally {
                        th = th;
                        while (true) {
                            try {
                            } catch (Throwable th) {
                                th = th;
                            }
                        }
                    }
                }
                iomVar.v(fnwVar);
                synchronized (iomVar.a) {
                    try {
                        fnf fnfVar = (fnf) ((ko) iomVar.d).get(fnwVar);
                        eakVar = fnfVar != null ? fnfVar.e : null;
                    } finally {
                        th = th;
                        while (true) {
                            try {
                            } catch (Throwable th2) {
                                th = th2;
                            }
                        }
                    }
                }
                eak eakVarR = fki.r(eakVar, this.q.M());
                fnv fnvVar = fnwVar.d;
                eci.e(fnvVar);
                z5 = z2;
                z4 = z3;
                try {
                    fnvVar.d(iA, fqrVarB, eakVarR, z5, z4);
                } catch (DeadObjectException unused) {
                    A(fnwVar);
                    i++;
                    z2 = z5;
                    z3 = z4;
                } catch (RemoteException e) {
                    e = e;
                    edb.f("MediaSessionImpl", "Exception in ".concat(fnwVar.toString()), e);
                    i++;
                    z2 = z5;
                    z3 = z4;
                }
            } catch (DeadObjectException unused2) {
            } catch (RemoteException e2) {
                e = e2;
            }
            i++;
            z2 = z5;
            z3 = z4;
        }
    }

    public final void j(fon fonVar) {
        try {
            fonVar.a(this.g.c, 0);
        } catch (RemoteException e) {
            edb.d("MediaSessionImpl", "Exception in using media1 API", e);
        }
    }

    protected final void k(fnw fnwVar, fon fonVar) {
        int iA;
        try {
            fqv fqvVarK = this.x.d.k(fnwVar);
            if (fqvVarK != null) {
                iA = fqvVarK.a();
            } else if (!c(fnwVar)) {
                return;
            } else {
                iA = 0;
            }
            fnv fnvVar = fnwVar.d;
            if (fnvVar != null) {
                fonVar.a(fnvVar, iA);
            }
        } catch (DeadObjectException unused) {
            A(fnwVar);
        } catch (RemoteException e) {
            edb.f("MediaSessionImpl", "Exception in ".concat(fnwVar.toString()), e);
        }
    }

    public final void l(eak eakVar) {
        this.c.a(false, false);
        a(new fof(eakVar, 0));
        j(new fof(this, 2));
    }

    public final void m(fnw fnwVar, boolean z2) {
        if (t()) {
            boolean z3 = this.q.q(16) && this.q.ar() != null;
            boolean z4 = this.q.q(31) || this.q.q(20);
            fnw fnwVarF = f(fnwVar);
            int[] iArr = eaj.a;
            rin rinVar = new rin(null, null);
            rinVar.j(1);
            eak eakVarA = eaj.a(rinVar);
            if (!z3) {
                if (z4) {
                    sfy.K(this.e.j(), new fog(this, fnwVarF, z2, eakVarA), new emk(this, 4));
                    return;
                }
                edb.e("MediaSessionImpl", "Play requested without current MediaItem, but playback resumption prevented by missing available commands");
            }
            edt.aF(this.q);
            if (z2) {
                x(fnwVarF);
            }
        }
    }

    public final void n(fnw fnwVar) {
        if (this.t && v(fnwVar)) {
            return;
        }
        this.e.f();
    }

    public final void o() {
        Handler handler = this.k;
        Runnable runnable = this.A;
        handler.removeCallbacks(runnable);
        if (this.B) {
            long j = this.C;
            if (j > 0) {
                if (this.q.u() || this.q.aD()) {
                    handler.postDelayed(runnable, j);
                }
            }
        }
    }

    public final void p() {
        if (Looper.myLooper() != this.k.getLooper()) {
            throw new IllegalStateException("Player callback method is called from a wrong thread. See javadoc of MediaSession for details.");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0072  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean q(android.view.KeyEvent r9, boolean r10, boolean r11) {
        /*
            r8 = this;
            fny r0 = r8.j
            foo r0 = r0.a
            fnw r4 = r0.e()
            defpackage.a.aq(r4)
            int r9 = r9.getKeyCode()
            r0 = 85
            r7 = 1
            r1 = 0
            if (r9 == r0) goto L1a
            r0 = 79
            if (r9 != r0) goto L1d
            r9 = r0
        L1a:
            if (r10 == 0) goto L1d
            goto L65
        L1d:
            r10 = 126(0x7e, float:1.77E-43)
            if (r9 == r10) goto L72
            r10 = 127(0x7f, float:1.78E-43)
            if (r9 == r10) goto L6c
            r10 = 272(0x110, float:3.81E-43)
            if (r9 == r10) goto L65
            r10 = 273(0x111, float:3.83E-43)
            if (r9 == r10) goto L5e
            switch(r9) {
                case 85: goto L46;
                case 86: goto L3f;
                case 87: goto L65;
                case 88: goto L5e;
                case 89: goto L38;
                case 90: goto L31;
                default: goto L30;
            }
        L30:
            return r1
        L31:
            foa r9 = new foa
            r10 = 3
            r9.<init>(r8, r4, r10)
            goto L6a
        L38:
            foa r9 = new foa
            r10 = 4
            r9.<init>(r8, r4, r10)
            goto L6a
        L3f:
            foa r9 = new foa
            r10 = 5
            r9.<init>(r8, r4, r10)
            goto L6a
        L46:
            fqt r9 = r8.q
            boolean r9 = r9.al()
            if (r9 == 0) goto L56
            eoy r9 = new eoy
            r10 = 18
            r9.<init>(r8, r4, r10)
            goto L6a
        L56:
            eoy r9 = new eoy
            r10 = 19
            r9.<init>(r8, r4, r10)
            goto L6a
        L5e:
            foa r9 = new foa
            r10 = 2
            r9.<init>(r8, r4, r10)
            goto L6a
        L65:
            foa r9 = new foa
            r9.<init>(r8, r4, r1)
        L6a:
            r5 = r9
            goto L7a
        L6c:
            foa r9 = new foa
            r9.<init>(r8, r4, r7)
            goto L6a
        L72:
            eoy r9 = new eoy
            r10 = 20
            r9.<init>(r8, r4, r10)
            goto L6a
        L7a:
            android.os.Handler r9 = r8.k
            fob r1 = new fob
            r6 = 0
            r2 = r8
            r3 = r11
            r1.<init>(r2, r3, r4, r5, r6)
            defpackage.edt.aB(r9, r1)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.foo.q(android.view.KeyEvent, boolean, boolean):boolean");
    }

    public final boolean r(fnw fnwVar) {
        return Objects.equals(fnwVar.a(), this.f.getPackageName()) && fnwVar.b != 0 && new Bundle(fnwVar.e).getBoolean("androidx.media3.session.MediaNotificationManager", false);
    }

    public final boolean s() {
        boolean z2;
        synchronized (this.a) {
            z2 = this.s;
        }
        return z2;
    }

    final boolean t() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            return true;
        }
        final uic uicVar = new uic();
        this.m.post(new Runnable() { // from class: foc
            @Override // java.lang.Runnable
            public final void run() {
                uicVar.b(Boolean.valueOf(this.a.t()));
            }
        });
        try {
            return ((Boolean) uicVar.s()).booleanValue();
        } catch (InterruptedException | ExecutionException e) {
            throw new IllegalStateException(e);
        }
    }

    public final void u(fnw fnwVar, fon fonVar) {
        int i;
        fqu fquVar;
        try {
            fqv fqvVarK = this.x.d.k(fnwVar);
            if (fqvVarK != null) {
                fra fraVar = z;
                synchronized (fqvVarK.a) {
                    int iA = fqvVarK.a();
                    fquVar = new fqu(iA, fraVar);
                    if (fqvVarK.c) {
                        fquVar.a();
                    } else {
                        ((ko) fqvVarK.d).put(Integer.valueOf(iA), fquVar);
                    }
                }
                i = fquVar.a;
            } else if (!c(fnwVar)) {
                sfy.C(new fra(-100));
                return;
            } else {
                sfy.C(new fra(0));
                i = 0;
            }
            fnv fnvVar = fnwVar.d;
            if (fnvVar != null) {
                fonVar.a(fnvVar, i);
            }
        } catch (DeadObjectException unused) {
            A(fnwVar);
            sfy.C(new fra(-100));
        } catch (RemoteException e) {
            edb.f("MediaSessionImpl", "Exception in ".concat(fnwVar.toString()), e);
            sfy.C(new fra(-1));
        }
    }

    public final void w(fnw fnwVar) {
        f(fnwVar);
        this.e.d();
    }

    protected final void x(fnw fnwVar) {
        f(fnwVar);
        this.e.e();
    }

    public final uhp y(fnw fnwVar) {
        f(fnwVar);
        return this.e.i();
    }

    public final uhp z(fnw fnwVar) {
        f(fnwVar);
        return this.e.l();
    }
}
