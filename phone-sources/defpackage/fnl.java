package defpackage;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Surface;
import com.google.common.collect.ImmutableBiMap;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.UnmodifiableIterator;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fnl extends ifk implements IInterface {
    public final WeakReference a;
    public final Set b;
    public ImmutableBiMap c;
    public final iom d;
    private int e;

    public fnl() {
        super("androidx.media3.session.IMediaSession");
    }

    public static void W(fnw fnwVar, int i, fra fraVar) {
        try {
            fnv fnvVar = fnwVar.d;
            eci.e(fnvVar);
            fnvVar.f(i, fraVar);
        } catch (RemoteException e) {
            edb.f("MediaSessionStub", "Failed to send result to controller ".concat(fnwVar.toString()), e);
        }
    }

    private static fqo av(final ecq ecqVar) {
        return new fpj(new fqm() { // from class: fqe
            @Override // defpackage.fqm
            public final void a(fqt fqtVar, fnw fnwVar) {
                ecqVar.a(fqtVar);
            }
        }, 1);
    }

    private final void aw(fnk fnkVar, int i, int i2, fqo fqoVar) {
        ax(fnkVar, i, null, i2, fqoVar);
    }

    private final void ax(fnk fnkVar, final int i, final fqw fqwVar, final int i2, final fqo fqoVar) {
        final fnw fnwVarJ;
        long jClearCallingIdentity = Binder.clearCallingIdentity();
        try {
            final foo fooVar = (foo) this.a.get();
            if (fooVar != null && !fooVar.s() && (fnwVarJ = this.d.j(fnkVar.asBinder())) != null) {
                edt.aB(fooVar.k, new Runnable() { // from class: fpu
                    @Override // java.lang.Runnable
                    public final void run() {
                        iom iomVar = this.g.d;
                        fnw fnwVar = fnwVarJ;
                        if (iomVar.r(fnwVar)) {
                            int i3 = i;
                            fqw fqwVar2 = fqwVar;
                            if (fqwVar2 != null) {
                                if (!iomVar.u(fnwVar, fqwVar2)) {
                                    fnl.W(fnwVar, i3, new fra(-4));
                                    return;
                                }
                            } else if (!iomVar.t(fnwVar, i2)) {
                                fnl.W(fnwVar, i3, new fra(-4));
                                return;
                            }
                            fqoVar.a(fooVar, fnwVar, i3);
                        }
                    }
                });
            }
        } finally {
            Binder.restoreCallingIdentity(jClearCallingIdentity);
        }
    }

    private final void ay(fnk fnkVar, int i, int i2, fqo fqoVar) {
        fnw fnwVarJ = this.d.j(fnkVar.asBinder());
        if (fnwVarJ != null) {
            az(fnwVarJ, i, i2, fqoVar);
        }
    }

    private final void az(final fnw fnwVar, final int i, final int i2, final fqo fqoVar) {
        long jClearCallingIdentity = Binder.clearCallingIdentity();
        try {
            final foo fooVar = (foo) this.a.get();
            if (fooVar != null && !fooVar.s()) {
                edt.aB(fooVar.k, new Runnable() { // from class: fpv
                    @Override // java.lang.Runnable
                    public final void run() {
                        iom iomVar = this.f.d;
                        final fnw fnwVar2 = fnwVar;
                        final int i3 = i;
                        int i4 = i2;
                        if (!iomVar.s(fnwVar2, i4)) {
                            fnl.W(fnwVar2, i3, new fra(-4));
                            return;
                        }
                        final fqo fqoVar2 = fqoVar;
                        final foo fooVar2 = fooVar;
                        fooVar2.w(fnwVar2);
                        if (i4 != 27) {
                            iomVar.n(fnwVar2, i4, new fne() { // from class: fqj
                                /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, uhp] */
                                @Override // defpackage.fne
                                public final uhp a() {
                                    return fqoVar2.a(fooVar2, fnwVar2, i3);
                                }
                            });
                        } else {
                            new foe(new fqc(fqoVar2, fooVar2, fnwVar2, i3, 0), 1).run();
                            iomVar.n(fnwVar2, 27, new fne() { // from class: fqg
                                @Override // defpackage.fne
                                public final uhp a() {
                                    return uhl.a;
                                }
                            });
                        }
                    }
                });
            }
        } finally {
            Binder.restoreCallingIdentity(jClearCallingIdentity);
        }
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, uhp] */
    public static uhp c(final foo fooVar, fnw fnwVar, int i, fqo fqoVar, final ecq ecqVar) {
        if (fooVar.s()) {
            return uhl.a;
        }
        final ?? A = fqoVar.a(fooVar, fnwVar, i);
        final uic uicVar = new uic();
        A.c(new Runnable() { // from class: fpn
            @Override // java.lang.Runnable
            public final void run() {
                ecq ecqVar2 = ecqVar;
                uic uicVar2 = uicVar;
                uhp uhpVar = A;
                if (fooVar.s()) {
                    uicVar2.b((Object) null);
                    return;
                }
                try {
                    ecqVar2.a(uhpVar);
                    uicVar2.b((Object) null);
                } catch (Throwable th) {
                    uicVar2.e(th);
                }
            }
        }, ugk.a);
        return uicVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ void s(fnw fnwVar, int i, uhp uhpVar) {
        fnn fnnVarA;
        try {
            fnnVarA = (fnn) uhpVar.get();
            eci.d(fnnVarA, "LibraryResult must not be null");
        } catch (InterruptedException e) {
            e = e;
            edb.f("MediaSessionStub", "Library operation failed", e);
            fnnVarA = fnn.a(-1);
        } catch (CancellationException e2) {
            edb.f("MediaSessionStub", "Library operation cancelled", e2);
            fnnVarA = fnn.a(1);
        } catch (ExecutionException e3) {
            e = e3;
            edb.f("MediaSessionStub", "Library operation failed", e);
            fnnVarA = fnn.a(-1);
        }
        try {
            fnv fnvVar = fnwVar.d;
            eci.e(fnvVar);
            fnvVar.b(i, fnnVarA);
        } catch (RemoteException e4) {
            edb.f("MediaSessionStub", "Failed to send result to browser ".concat(fnwVar.toString()), e4);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static /* synthetic */ void t(defpackage.fnw r3, int r4, defpackage.uhp r5) {
        /*
            java.lang.String r0 = "MediaSessionStub"
            r1 = 1
            java.lang.Object r5 = r5.get()     // Catch: java.lang.InterruptedException -> Lf java.util.concurrent.ExecutionException -> L11 java.util.concurrent.CancellationException -> L29
            fra r5 = (defpackage.fra) r5     // Catch: java.lang.InterruptedException -> Lf java.util.concurrent.ExecutionException -> L11 java.util.concurrent.CancellationException -> L29
            java.lang.String r2 = "SessionResult must not be null"
            defpackage.eci.d(r5, r2)     // Catch: java.lang.InterruptedException -> Lf java.util.concurrent.ExecutionException -> L11 java.util.concurrent.CancellationException -> L29
            goto L34
        Lf:
            r5 = move-exception
            goto L12
        L11:
            r5 = move-exception
        L12:
            java.lang.String r2 = "Session operation failed"
            defpackage.edb.f(r0, r2, r5)
            fra r0 = new fra
            java.lang.Throwable r5 = r5.getCause()
            boolean r5 = r5 instanceof java.lang.UnsupportedOperationException
            if (r1 == r5) goto L23
            r5 = -1
            goto L24
        L23:
            r5 = -6
        L24:
            r0.<init>(r5)
            r5 = r0
            goto L34
        L29:
            r5 = move-exception
            java.lang.String r2 = "Session operation cancelled"
            defpackage.edb.f(r0, r2, r5)
            fra r5 = new fra
            r5.<init>(r1)
        L34:
            W(r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fnl.t(fnw, int, uhp):void");
    }

    public final void A(fnk fnkVar, int i) {
        fnw fnwVarJ;
        if (fnkVar == null || (fnwVarJ = this.d.j(fnkVar.asBinder())) == null) {
            return;
        }
        B(fnwVarJ, i);
    }

    public final void B(fnw fnwVar, int i) {
        az(fnwVar, i, 1, av(new ewf(this, fnwVar, 2)));
    }

    public final void C(fnk fnkVar, int i) {
        if (fnkVar == null) {
            return;
        }
        ay(fnkVar, i, 2, av(new fqd(0)));
    }

    public final void D(fnk fnkVar, int i, int i2) {
        if (fnkVar == null || i2 < 0) {
            return;
        }
        ay(fnkVar, i, 20, new fpj(new fpl(this, i2, 1), 1));
    }

    public final void E(fnk fnkVar, int i, final int i2, final int i3) {
        if (fnkVar == null || i2 < 0 || i3 < i2) {
            return;
        }
        ay(fnkVar, i, 20, new fpj(new fqm() { // from class: fpo
            @Override // defpackage.fqm
            public final void a(fqt fqtVar, fnw fnwVar) {
                int i4 = i3;
                fnl fnlVar = this.c;
                int iA = fnlVar.a(fnwVar, fqtVar, i2);
                int iA2 = fnlVar.a(fnwVar, fqtVar, i4);
                fqtVar.aC();
                fqtVar.a.Y(iA, iA2);
            }
        }, 1));
    }

    public final void F(fnk fnkVar, int i, int i2, Bundle bundle) {
        if (fnkVar == null || bundle == null || i2 < 0) {
            return;
        }
        try {
            int i3 = 3;
            ay(fnkVar, i, 20, new fpj(new fpt(new fpj(dzy.c(bundle), i3), new fpp(this, i2, 0), i3), 8));
        } catch (RuntimeException e) {
            edb.f("MediaSessionStub", "Ignoring malformed Bundle for MediaItem", e);
        }
    }

    public final void G(fnk fnkVar, int i, final int i2, final int i3, IBinder iBinder) {
        if (fnkVar == null || iBinder == null || i2 < 0 || i3 < i2) {
            return;
        }
        try {
            ay(fnkVar, i, 20, new fpj(new fpt(new fpj(ecm.a(new eyt(7), dyr.a(iBinder)), 0), new fqn() { // from class: fpk
                @Override // defpackage.fqn
                public final void a(fqt fqtVar, fnw fnwVar, List list) {
                    int i4 = i3;
                    fnl fnlVar = this.c;
                    fqtVar.Z(fnlVar.a(fnwVar, fqtVar, i2), fnlVar.a(fnwVar, fqtVar, i4), list);
                }
            }, 3), 8));
        } catch (RuntimeException e) {
            edb.f("MediaSessionStub", "Ignoring malformed Bundle for MediaItem", e);
        }
    }

    public final void H(fnk fnkVar, int i, String str, Bundle bundle) {
        if (fnkVar == null) {
            return;
        }
        if (TextUtils.isEmpty(str)) {
            edb.e("MediaSessionStub", "search(): Ignoring empty query");
            return;
        }
        if (bundle != null) {
            try {
                fno.a(bundle);
            } catch (RuntimeException e) {
                edb.f("MediaSessionStub", "Ignoring malformed Bundle for LibraryParams", e);
                return;
            }
        }
        int i2 = 7;
        aw(fnkVar, i, 50005, new fpj(new fpi(i2), i2));
    }

    public final void I(fnk fnkVar, int i) {
        fnw fnwVarJ;
        if (fnkVar == null || (fnwVarJ = this.d.j(fnkVar.asBinder())) == null) {
            return;
        }
        J(fnwVarJ, i);
    }

    public final void J(fnw fnwVar, int i) {
        az(fnwVar, i, 11, av(new eoj(12)));
    }

    public final void K(fnk fnkVar, int i) {
        fnw fnwVarJ;
        if (fnkVar == null || (fnwVarJ = this.d.j(fnkVar.asBinder())) == null) {
            return;
        }
        L(fnwVarJ, i);
    }

    public final void L(fnw fnwVar, int i) {
        az(fnwVar, i, 12, av(new eoj(17)));
    }

    public final void M(fnk fnkVar, int i, final long j) {
        if (fnkVar == null) {
            return;
        }
        ay(fnkVar, i, 5, av(new ecq() { // from class: fqi
            @Override // defpackage.ecq
            public final void a(Object obj) {
                ((fqt) obj).i(j);
            }
        }));
    }

    public final void N(fnk fnkVar, int i) {
        if (fnkVar == null) {
            return;
        }
        ay(fnkVar, i, 4, av(new eoj(8)));
    }

    public final void O(fnk fnkVar, int i, int i2) {
        if (fnkVar == null || i2 < 0) {
            return;
        }
        ay(fnkVar, i, 10, new fpj(new fpl(this, i2, 0), 1));
    }

    public final void P(fnk fnkVar, int i) {
        fnw fnwVarJ;
        if (fnkVar == null || (fnwVarJ = this.d.j(fnkVar.asBinder())) == null) {
            return;
        }
        Q(fnwVarJ, i);
    }

    public final void Q(fnw fnwVar, int i) {
        az(fnwVar, i, 9, av(new eoj(18)));
    }

    public final void R(fnk fnkVar, int i) {
        if (fnkVar == null) {
            return;
        }
        ay(fnkVar, i, 8, av(new eoj(10)));
    }

    public final void S(fnk fnkVar, int i) {
        fnw fnwVarJ;
        if (fnkVar == null || (fnwVarJ = this.d.j(fnkVar.asBinder())) == null) {
            return;
        }
        T(fnwVarJ, i);
    }

    public final void T(fnw fnwVar, int i) {
        az(fnwVar, i, 7, av(new eoj(14)));
    }

    public final void U(fnk fnkVar, int i) {
        if (fnkVar == null) {
            return;
        }
        ay(fnkVar, i, 6, av(new eoj(16)));
    }

    public final void V(fnk fnkVar, int i, final int i2, final long j) {
        if (fnkVar == null || i2 < 0) {
            return;
        }
        ay(fnkVar, i, 10, new fpj(new fqm() { // from class: fpm
            @Override // defpackage.fqm
            public final void a(fqt fqtVar, fnw fnwVar) {
                int iA = this.c.a(fnwVar, fqtVar, i2);
                fqtVar.aC();
                ((dyq) fqtVar.a).v(iA, j, false);
            }
        }, 1));
    }

    public final void X(fnk fnkVar, int i, Bundle bundle, final boolean z) {
        if (fnkVar == null || bundle == null) {
            return;
        }
        try {
            String str = dyo.b;
            int i2 = bundle.containsKey(str) ? bundle.getInt(str) : 0;
            String str2 = dyo.c;
            int i3 = bundle.containsKey(str2) ? bundle.getInt(str2) : 0;
            String str3 = dyo.d;
            int i4 = bundle.containsKey(str3) ? bundle.getInt(str3) : 1;
            String str4 = dyo.e;
            int i5 = bundle.containsKey(str4) ? bundle.getInt(str4) : 1;
            String str5 = dyo.f;
            final dyo dyoVar = new dyo(i2, i3, i4, i5, bundle.containsKey(str5) ? bundle.getInt(str5) : 0);
            ay(fnkVar, i, 35, av(new ecq() { // from class: fpx
                @Override // defpackage.ecq
                public final void a(Object obj) {
                    eiz eizVar = (eiz) ((fqt) obj).a;
                    eizVar.aG();
                    if (eizVar.z) {
                        return;
                    }
                    dyo dyoVar2 = dyoVar;
                    if (!Objects.equals(eizVar.v, dyoVar2)) {
                        eizVar.v = dyoVar2;
                        eizVar.az(1, 3, dyoVar2);
                        eizVar.H.e(20, new ein(dyoVar2, 6));
                    }
                    eizVar.f.f(eizVar.v, z);
                    eizVar.H.d();
                }
            }));
        } catch (RuntimeException e) {
            edb.f("MediaSessionStub", "Ignoring malformed Bundle for AudioAttributes", e);
        }
    }

    public final void Y(fnk fnkVar, int i, boolean z) {
        if (fnkVar == null) {
            return;
        }
        ay(fnkVar, i, 26, av(new eoj(13)));
    }

    public final void Z(fnk fnkVar, int i, boolean z, int i2) {
        if (fnkVar == null) {
            return;
        }
        ay(fnkVar, i, 34, av(new fqd(2)));
    }

    public final int a(fnw fnwVar, fqt fqtVar, int i) {
        if (!fqtVar.q(17)) {
            return i;
        }
        iom iomVar = this.d;
        return (iomVar.s(fnwVar, 17) || !iomVar.s(fnwVar, 16)) ? i : i + fqtVar.bd();
    }

    public final void aa(fnk fnkVar, int i, int i2) {
        if (fnkVar == null || i2 < 0) {
            return;
        }
        ay(fnkVar, i, 25, av(new fqd(3)));
    }

    public final void ab(fnk fnkVar, int i, int i2, int i3) {
        if (fnkVar == null || i2 < 0) {
            return;
        }
        ay(fnkVar, i, 33, av(new eoj(19)));
    }

    public final void ac(fnk fnkVar, int i, Bundle bundle) {
        ad(fnkVar, i, bundle, true);
    }

    public final void ad(fnk fnkVar, int i, Bundle bundle, boolean z) {
        if (fnkVar == null || bundle == null) {
            return;
        }
        try {
            ay(fnkVar, i, 31, new fpj(new fpt(new fpq(dzy.c(bundle), z, 0), new fki(), 2), 8));
        } catch (RuntimeException e) {
            edb.f("MediaSessionStub", "Ignoring malformed Bundle for MediaItem", e);
        }
    }

    public final void ae(fnk fnkVar, int i, Bundle bundle, final long j) {
        if (fnkVar == null || bundle == null) {
            return;
        }
        try {
            final dzy dzyVarC = dzy.c(bundle);
            ay(fnkVar, i, 31, new fpj(new fpt(new fqo() { // from class: fqf
                @Override // defpackage.fqo
                public final Object a(foo fooVar, fnw fnwVar, int i2) {
                    return fooVar.h(fnwVar, ImmutableList.of(dzyVarC), 0, j);
                }
            }, new fki(), 2), 8));
        } catch (RuntimeException e) {
            edb.f("MediaSessionStub", "Ignoring malformed Bundle for MediaItem", e);
        }
    }

    public final void af(fnk fnkVar, int i, IBinder iBinder, boolean z) {
        if (fnkVar == null || iBinder == null) {
            return;
        }
        try {
            ay(fnkVar, i, 20, new fpj(new fpt(new fpq(ecm.a(new eyt(7), dyr.a(iBinder)), z, 1), new fki(), 2), 8));
        } catch (RuntimeException e) {
            edb.f("MediaSessionStub", "Ignoring malformed Bundle for MediaItem", e);
        }
    }

    public final void ag(fnk fnkVar, int i, IBinder iBinder, final int i2, final long j) {
        if (fnkVar == null || iBinder == null) {
            return;
        }
        if (i2 == -1 || i2 >= 0) {
            try {
                final ImmutableList immutableListA = ecm.a(new eyt(7), dyr.a(iBinder));
                ay(fnkVar, i, 20, new fpj(new fpt(new fqo() { // from class: fps
                    @Override // defpackage.fqo
                    public final Object a(foo fooVar, fnw fnwVar, int i3) {
                        int i4 = i2;
                        int iBd = i4 == -1 ? fooVar.q.bd() : i4;
                        long jD = j;
                        if (i4 == -1) {
                            jD = fooVar.q.D();
                        }
                        return fooVar.h(fnwVar, immutableListA, iBd, jD);
                    }
                }, new fki(), 2), 8));
            } catch (RuntimeException e) {
                edb.f("MediaSessionStub", "Ignoring malformed Bundle for MediaItem", e);
            }
        }
    }

    public final void ah(fnk fnkVar, int i, boolean z) {
        if (fnkVar == null) {
            return;
        }
        ay(fnkVar, i, 1, av(new fqa(z, 1)));
    }

    public final void ai(fnk fnkVar, int i, Bundle bundle) {
        if (fnkVar == null || bundle == null) {
            return;
        }
        try {
            ay(fnkVar, i, 13, av(new fja(new eai(bundle.getFloat(eai.b, 1.0f), bundle.getFloat(eai.c, 1.0f)), 2)));
        } catch (RuntimeException e) {
            edb.f("MediaSessionStub", "Ignoring malformed Bundle for PlaybackParameters", e);
        }
    }

    public final void aj(fnk fnkVar, int i, float f) {
        if (fnkVar == null || f <= 0.0f) {
            return;
        }
        ay(fnkVar, i, 13, av(new fpz(f, 1)));
    }

    public final void ak(fnk fnkVar, int i, Bundle bundle) {
        if (fnkVar == null || bundle == null) {
            return;
        }
        try {
            ay(fnkVar, i, 19, av(new fja(eab.b(bundle), 4)));
        } catch (RuntimeException e) {
            edb.f("MediaSessionStub", "Ignoring malformed Bundle for MediaMetadata", e);
        }
    }

    public final void al(fnk fnkVar, int i, Bundle bundle) {
        if (fnkVar == null || bundle == null) {
            return;
        }
        try {
            eaq.c(bundle);
            aw(fnkVar, i, 40010, new fpj(new fpi(1), 8));
        } catch (RuntimeException e) {
            edb.f("MediaSessionStub", "Ignoring malformed Bundle for Rating", e);
        }
    }

    public final void am(fnk fnkVar, int i, String str, Bundle bundle) {
        if (fnkVar == null || str == null || bundle == null) {
            return;
        }
        if (TextUtils.isEmpty(str)) {
            edb.e("MediaSessionStub", "setRatingWithMediaId(): Ignoring empty mediaId");
            return;
        }
        try {
            aw(fnkVar, i, 40010, new fpj(new fpt(str, eaq.c(bundle), 0), 8));
        } catch (RuntimeException e) {
            edb.f("MediaSessionStub", "Ignoring malformed Bundle for Rating", e);
        }
    }

    public final void an(fnk fnkVar, int i, final int i2) {
        if (fnkVar == null) {
            return;
        }
        if (i2 != 2 && i2 != 0) {
            if (i2 != 1) {
                return;
            } else {
                i2 = 1;
            }
        }
        ay(fnkVar, i, 15, av(new ecq() { // from class: fpw
            @Override // defpackage.ecq
            public final void a(Object obj) {
                ((fqt) obj).ad(i2);
            }
        }));
    }

    public final void ao(fnk fnkVar, int i, boolean z) {
        if (fnkVar == null) {
            return;
        }
        ay(fnkVar, i, 14, av(new fqa(z, 0)));
    }

    public final void ap(fnk fnkVar, int i, Bundle bundle) {
        if (fnkVar == null || bundle == null) {
            return;
        }
        try {
            ebf ebfVar = ebf.a;
            ay(fnkVar, i, 29, av(new ewf(this, new ebf(new ebe(bundle)), 3)));
        } catch (RuntimeException e) {
            edb.f("MediaSessionStub", "Ignoring malformed Bundle for TrackSelectionParameters", e);
        }
    }

    public final void aq(fnk fnkVar, int i, float f) {
        if (fnkVar == null || f < 0.0f || f > 1.0f) {
            return;
        }
        ay(fnkVar, i, 24, av(new fpz(f, 0)));
    }

    public final void ar(fnw fnwVar, int i) {
        az(fnwVar, i, 3, av(new fqd(1)));
    }

    public final void as(fnk fnkVar, int i, String str, Bundle bundle) {
        if (fnkVar == null) {
            return;
        }
        if (TextUtils.isEmpty(str)) {
            edb.e("MediaSessionStub", "subscribe(): Ignoring empty parentId");
            return;
        }
        if (bundle != null) {
            try {
                fno.a(bundle);
            } catch (RuntimeException e) {
                edb.f("MediaSessionStub", "Ignoring malformed Bundle for LibraryParams", e);
                return;
            }
        }
        aw(fnkVar, i, 50001, new fpj(new fpi(6), 7));
    }

    public final void at(final fnk fnkVar, Bundle bundle) {
        if (fnkVar == null || bundle == null) {
            return;
        }
        try {
            int i = bundle.getInt(fng.a, 0);
            int i2 = bundle.getInt(fng.e, 0);
            String string = bundle.getString(fng.b);
            string.getClass();
            String str = fng.c;
            a.H(bundle.containsKey(str));
            int i3 = bundle.getInt(str);
            Bundle bundle2 = bundle.getBundle(fng.d);
            bundle.getInt(fng.f, 0);
            if (bundle2 == null) {
                bundle2 = Bundle.EMPTY;
            }
            Bundle bundle3 = bundle2;
            int callingUid = Binder.getCallingUid();
            int callingPid = Binder.getCallingPid();
            if (callingPid != 0) {
                i3 = callingPid;
            }
            long jClearCallingIdentity = Binder.clearCallingIdentity();
            try {
                fsf fsfVar = new fsf(string, i3, callingUid);
                WeakReference weakReference = this.a;
                foo fooVar = (foo) weakReference.get();
                if (fooVar != null) {
                    fsh.a(fooVar.f).b(fsfVar);
                }
                final fnw fnwVar = new fnw(fsfVar, i, i2, new fql(fnkVar, i2), bundle3);
                final foo fooVar2 = (foo) weakReference.get();
                if (fooVar2 == null || fooVar2.s()) {
                    try {
                        fnkVar.j();
                    } catch (RemoteException unused) {
                    }
                } else {
                    this.b.add(fnwVar);
                    edt.aB(fooVar2.k, new Runnable() { // from class: fqk
                        /* JADX WARN: Multi-variable type inference failed */
                        /* JADX WARN: Removed duplicated region for block: B:102:0x01ca A[EXC_TOP_SPLITTER, SYNTHETIC] */
                        /* JADX WARN: Removed duplicated region for block: B:73:0x01b6  */
                        /* JADX WARN: Removed duplicated region for block: B:95:0x01c0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
                        @Override // java.lang.Runnable
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct code enable 'Show inconsistent code' option in preferences
                        */
                        public final void run() throws java.lang.Throwable {
                            /*
                                Method dump skipped, instructions count: 462
                                To view this dump change 'Code comments level' option to 'DEBUG'
                            */
                            throw new UnsupportedOperationException("Method not decompiled: defpackage.fqk.run():void");
                        }
                    });
                }
            } finally {
                Binder.restoreCallingIdentity(jClearCallingIdentity);
            }
        } catch (RuntimeException e) {
            edb.f("MediaSessionStub", "Ignoring malformed Bundle for ConnectionRequest", e);
        }
    }

    public final void au(fnk fnkVar) {
        if (fnkVar == null) {
            return;
        }
        long jClearCallingIdentity = Binder.clearCallingIdentity();
        try {
            foo fooVar = (foo) this.a.get();
            if (fooVar != null && !fooVar.s()) {
                edt.aB(fooVar.k, new foa(this, fnkVar, 11));
            }
        } finally {
            Binder.restoreCallingIdentity(jClearCallingIdentity);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final fqr b(fqr fqrVar) {
        ImmutableList immutableList = fqrVar.L.c;
        ImmutableList.Builder builder = ImmutableList.builder();
        ImmutableBiMap.Builder builder2 = ImmutableBiMap.builder();
        for (int i = 0; i < immutableList.size(); i++) {
            ebg ebgVar = (ebg) immutableList.get(i);
            eba ebaVar = ebgVar.f;
            String str = (String) this.c.get(ebaVar);
            if (str == null) {
                int i2 = this.e;
                this.e = i2 + 1;
                str = edt.Z(i2) + "-" + ebaVar.d;
            }
            builder2.put((ImmutableBiMap.Builder) ebaVar, (eba) str);
            builder.add((ImmutableList.Builder) new ebg(ebaVar.d(str), ebgVar.g, ebgVar.h, ebgVar.i));
        }
        this.c = builder2.buildOrThrow();
        fqr fqrVarB = fqrVar.b(new ebh(builder.build()));
        ebf ebfVar = fqrVarB.M;
        ImmutableMap immutableMap = ebfVar.am;
        if (immutableMap.isEmpty()) {
            return fqrVarB;
        }
        ebe ebeVarB = ebfVar.b();
        ebeVarB.e();
        UnmodifiableIterator it = immutableMap.values().iterator();
        while (it.hasNext()) {
            ebb ebbVar = (ebb) it.next();
            eba ebaVar2 = ebbVar.c;
            String str2 = (String) this.c.get(ebaVar2);
            if (str2 != null) {
                ebeVarB.c(new ebb(ebaVar2.d(str2), ebbVar.d));
            } else {
                ebeVarB.c(ebbVar);
            }
        }
        return fqrVarB.e(ebeVarB.a());
    }

    public final void d(fnk fnkVar, int i, Bundle bundle) {
        if (fnkVar == null || bundle == null) {
            return;
        }
        try {
            ay(fnkVar, i, 20, new fpj(new fpt(new fpj(dzy.c(bundle), 6), new fpy(0), 3), 8));
        } catch (RuntimeException e) {
            edb.f("MediaSessionStub", "Ignoring malformed Bundle for MediaItem", e);
        }
    }

    public final void e(fnk fnkVar, int i, int i2, Bundle bundle) {
        if (fnkVar == null || bundle == null || i2 < 0) {
            return;
        }
        try {
            ay(fnkVar, i, 20, new fpj(new fpt(new fpj(dzy.c(bundle), 2), new fpp(this, i2, 1), 3), 8));
        } catch (RuntimeException e) {
            edb.f("MediaSessionStub", "Ignoring malformed Bundle for MediaItem", e);
        }
    }

    public final void f(fnk fnkVar, int i, IBinder iBinder) {
        if (fnkVar == null || iBinder == null) {
            return;
        }
        try {
            ay(fnkVar, i, 20, new fpj(new fpt(new fpj(ecm.a(new eyt(7), dyr.a(iBinder)), 5), new fpy(1), 3), 8));
        } catch (RuntimeException e) {
            edb.f("MediaSessionStub", "Ignoring malformed Bundle for MediaItem", e);
        }
    }

    public final void g(fnk fnkVar, int i, int i2, IBinder iBinder) {
        if (fnkVar == null || iBinder == null || i2 < 0) {
            return;
        }
        try {
            ay(fnkVar, i, 20, new fpj(new fpt(new fpj(ecm.a(new eyt(7), dyr.a(iBinder)), 4), new fpp(this, i2, 2), 3), 8));
        } catch (RuntimeException e) {
            edb.f("MediaSessionStub", "Ignoring malformed Bundle for MediaItem", e);
        }
    }

    public final void h(fnk fnkVar, int i) {
        if (fnkVar == null) {
            return;
        }
        ay(fnkVar, i, 20, av(new fqd(4)));
    }

    public final void i(fnk fnkVar, int i) {
        if (fnkVar == null) {
            return;
        }
        ay(fnkVar, i, 26, av(new eoj(7)));
    }

    public final void j(fnk fnkVar, int i, int i2) {
        if (fnkVar == null) {
            return;
        }
        ay(fnkVar, i, 34, av(new eoj(20)));
    }

    @Override // defpackage.ifk
    protected final boolean k(int i, Parcel parcel, Parcel parcel2) {
        fnw fnwVarJ;
        fnk fniVar = null;
        switch (i) {
            case 3002:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("androidx.media3.session.IMediaController");
                    fniVar = iInterfaceQueryLocalInterface instanceof fnk ? (fnk) iInterfaceQueryLocalInterface : new fni(strongBinder);
                }
                int i2 = parcel.readInt();
                float f = parcel.readFloat();
                ifl.b(parcel);
                aq(fniVar, i2, f);
                return true;
            case 3003:
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("androidx.media3.session.IMediaController");
                    fniVar = iInterfaceQueryLocalInterface2 instanceof fnk ? (fnk) iInterfaceQueryLocalInterface2 : new fni(strongBinder2);
                }
                int i3 = parcel.readInt();
                int i4 = parcel.readInt();
                ifl.b(parcel);
                aa(fniVar, i3, i4);
                return true;
            case 3004:
                IBinder strongBinder3 = parcel.readStrongBinder();
                if (strongBinder3 != null) {
                    IInterface iInterfaceQueryLocalInterface3 = strongBinder3.queryLocalInterface("androidx.media3.session.IMediaController");
                    fniVar = iInterfaceQueryLocalInterface3 instanceof fnk ? (fnk) iInterfaceQueryLocalInterface3 : new fni(strongBinder3);
                }
                int i5 = parcel.readInt();
                ifl.b(parcel);
                q(fniVar, i5);
                return true;
            case 3005:
                IBinder strongBinder4 = parcel.readStrongBinder();
                if (strongBinder4 != null) {
                    IInterface iInterfaceQueryLocalInterface4 = strongBinder4.queryLocalInterface("androidx.media3.session.IMediaController");
                    fniVar = iInterfaceQueryLocalInterface4 instanceof fnk ? (fnk) iInterfaceQueryLocalInterface4 : new fni(strongBinder4);
                }
                int i6 = parcel.readInt();
                ifl.b(parcel);
                i(fniVar, i6);
                return true;
            case 3006:
                IBinder strongBinder5 = parcel.readStrongBinder();
                if (strongBinder5 != null) {
                    IInterface iInterfaceQueryLocalInterface5 = strongBinder5.queryLocalInterface("androidx.media3.session.IMediaController");
                    fniVar = iInterfaceQueryLocalInterface5 instanceof fnk ? (fnk) iInterfaceQueryLocalInterface5 : new fni(strongBinder5);
                }
                int i7 = parcel.readInt();
                boolean zF = ifl.f(parcel);
                ifl.b(parcel);
                Y(fniVar, i7, zF);
                return true;
            case 3007:
                IBinder strongBinder6 = parcel.readStrongBinder();
                if (strongBinder6 != null) {
                    IInterface iInterfaceQueryLocalInterface6 = strongBinder6.queryLocalInterface("androidx.media3.session.IMediaController");
                    fniVar = iInterfaceQueryLocalInterface6 instanceof fnk ? (fnk) iInterfaceQueryLocalInterface6 : new fni(strongBinder6);
                }
                int i8 = parcel.readInt();
                Bundle bundle = (Bundle) ifl.a(parcel, Bundle.CREATOR);
                ifl.b(parcel);
                ac(fniVar, i8, bundle);
                return true;
            case 3008:
                IBinder strongBinder7 = parcel.readStrongBinder();
                if (strongBinder7 != null) {
                    IInterface iInterfaceQueryLocalInterface7 = strongBinder7.queryLocalInterface("androidx.media3.session.IMediaController");
                    fniVar = iInterfaceQueryLocalInterface7 instanceof fnk ? (fnk) iInterfaceQueryLocalInterface7 : new fni(strongBinder7);
                }
                fnk fnkVar = fniVar;
                int i9 = parcel.readInt();
                Bundle bundle2 = (Bundle) ifl.a(parcel, Bundle.CREATOR);
                long j = parcel.readLong();
                ifl.b(parcel);
                ae(fnkVar, i9, bundle2, j);
                return true;
            case 3009:
                IBinder strongBinder8 = parcel.readStrongBinder();
                if (strongBinder8 != null) {
                    IInterface iInterfaceQueryLocalInterface8 = strongBinder8.queryLocalInterface("androidx.media3.session.IMediaController");
                    fniVar = iInterfaceQueryLocalInterface8 instanceof fnk ? (fnk) iInterfaceQueryLocalInterface8 : new fni(strongBinder8);
                }
                int i10 = parcel.readInt();
                Bundle bundle3 = (Bundle) ifl.a(parcel, Bundle.CREATOR);
                boolean zF2 = ifl.f(parcel);
                ifl.b(parcel);
                ad(fniVar, i10, bundle3, zF2);
                return true;
            case 3010:
                IBinder strongBinder9 = parcel.readStrongBinder();
                if (strongBinder9 != null) {
                    IInterface iInterfaceQueryLocalInterface9 = strongBinder9.queryLocalInterface("androidx.media3.session.IMediaController");
                    fniVar = iInterfaceQueryLocalInterface9 instanceof fnk ? (fnk) iInterfaceQueryLocalInterface9 : new fni(strongBinder9);
                }
                int i11 = parcel.readInt();
                IBinder strongBinder10 = parcel.readStrongBinder();
                ifl.b(parcel);
                af(fniVar, i11, strongBinder10, true);
                return true;
            case 3011:
                IBinder strongBinder11 = parcel.readStrongBinder();
                if (strongBinder11 != null) {
                    IInterface iInterfaceQueryLocalInterface10 = strongBinder11.queryLocalInterface("androidx.media3.session.IMediaController");
                    fniVar = iInterfaceQueryLocalInterface10 instanceof fnk ? (fnk) iInterfaceQueryLocalInterface10 : new fni(strongBinder11);
                }
                int i12 = parcel.readInt();
                IBinder strongBinder12 = parcel.readStrongBinder();
                boolean zF3 = ifl.f(parcel);
                ifl.b(parcel);
                af(fniVar, i12, strongBinder12, zF3);
                return true;
            case 3012:
                IBinder strongBinder13 = parcel.readStrongBinder();
                if (strongBinder13 != null) {
                    IInterface iInterfaceQueryLocalInterface11 = strongBinder13.queryLocalInterface("androidx.media3.session.IMediaController");
                    fniVar = iInterfaceQueryLocalInterface11 instanceof fnk ? (fnk) iInterfaceQueryLocalInterface11 : new fni(strongBinder13);
                }
                fnk fnkVar2 = fniVar;
                int i13 = parcel.readInt();
                IBinder strongBinder14 = parcel.readStrongBinder();
                int i14 = parcel.readInt();
                long j2 = parcel.readLong();
                ifl.b(parcel);
                ag(fnkVar2, i13, strongBinder14, i14, j2);
                return true;
            case 3013:
                IBinder strongBinder15 = parcel.readStrongBinder();
                if (strongBinder15 != null) {
                    IInterface iInterfaceQueryLocalInterface12 = strongBinder15.queryLocalInterface("androidx.media3.session.IMediaController");
                    fniVar = iInterfaceQueryLocalInterface12 instanceof fnk ? (fnk) iInterfaceQueryLocalInterface12 : new fni(strongBinder15);
                }
                int i15 = parcel.readInt();
                boolean zF4 = ifl.f(parcel);
                ifl.b(parcel);
                ah(fniVar, i15, zF4);
                return true;
            case 3014:
                IBinder strongBinder16 = parcel.readStrongBinder();
                if (strongBinder16 != null) {
                    IInterface iInterfaceQueryLocalInterface13 = strongBinder16.queryLocalInterface("androidx.media3.session.IMediaController");
                    fniVar = iInterfaceQueryLocalInterface13 instanceof fnk ? (fnk) iInterfaceQueryLocalInterface13 : new fni(strongBinder16);
                }
                int i16 = parcel.readInt();
                Bundle bundle4 = (Bundle) ifl.a(parcel, Bundle.CREATOR);
                ifl.b(parcel);
                w(fniVar, i16, bundle4);
                return true;
            case 3015:
                IBinder strongBinder17 = parcel.readStrongBinder();
                if (strongBinder17 != null) {
                    IInterface iInterfaceQueryLocalInterface14 = strongBinder17.queryLocalInterface("androidx.media3.session.IMediaController");
                    fniVar = iInterfaceQueryLocalInterface14 instanceof fnk ? (fnk) iInterfaceQueryLocalInterface14 : new fni(strongBinder17);
                }
                parcel.readInt();
                Bundle bundle5 = (Bundle) ifl.a(parcel, Bundle.CREATOR);
                ifl.b(parcel);
                at(fniVar, bundle5);
                return true;
            case 3016:
                IBinder strongBinder18 = parcel.readStrongBinder();
                if (strongBinder18 != null) {
                    IInterface iInterfaceQueryLocalInterface15 = strongBinder18.queryLocalInterface("androidx.media3.session.IMediaController");
                    fniVar = iInterfaceQueryLocalInterface15 instanceof fnk ? (fnk) iInterfaceQueryLocalInterface15 : new fni(strongBinder18);
                }
                int i17 = parcel.readInt();
                Bundle bundle6 = (Bundle) ifl.a(parcel, Bundle.CREATOR);
                Bundle bundle7 = (Bundle) ifl.a(parcel, Bundle.CREATOR);
                ifl.b(parcel);
                x(fniVar, i17, bundle6, bundle7);
                return true;
            case 3017:
                IBinder strongBinder19 = parcel.readStrongBinder();
                if (strongBinder19 != null) {
                    IInterface iInterfaceQueryLocalInterface16 = strongBinder19.queryLocalInterface("androidx.media3.session.IMediaController");
                    fniVar = iInterfaceQueryLocalInterface16 instanceof fnk ? (fnk) iInterfaceQueryLocalInterface16 : new fni(strongBinder19);
                }
                int i18 = parcel.readInt();
                int i19 = parcel.readInt();
                ifl.b(parcel);
                an(fniVar, i18, i19);
                return true;
            case 3018:
                IBinder strongBinder20 = parcel.readStrongBinder();
                if (strongBinder20 != null) {
                    IInterface iInterfaceQueryLocalInterface17 = strongBinder20.queryLocalInterface("androidx.media3.session.IMediaController");
                    fniVar = iInterfaceQueryLocalInterface17 instanceof fnk ? (fnk) iInterfaceQueryLocalInterface17 : new fni(strongBinder20);
                }
                int i20 = parcel.readInt();
                boolean zF5 = ifl.f(parcel);
                ifl.b(parcel);
                ao(fniVar, i20, zF5);
                return true;
            case 3019:
                IBinder strongBinder21 = parcel.readStrongBinder();
                if (strongBinder21 != null) {
                    IInterface iInterfaceQueryLocalInterface18 = strongBinder21.queryLocalInterface("androidx.media3.session.IMediaController");
                    fniVar = iInterfaceQueryLocalInterface18 instanceof fnk ? (fnk) iInterfaceQueryLocalInterface18 : new fni(strongBinder21);
                }
                int i21 = parcel.readInt();
                int i22 = parcel.readInt();
                ifl.b(parcel);
                D(fniVar, i21, i22);
                return true;
            case 3020:
                IBinder strongBinder22 = parcel.readStrongBinder();
                if (strongBinder22 != null) {
                    IInterface iInterfaceQueryLocalInterface19 = strongBinder22.queryLocalInterface("androidx.media3.session.IMediaController");
                    fniVar = iInterfaceQueryLocalInterface19 instanceof fnk ? (fnk) iInterfaceQueryLocalInterface19 : new fni(strongBinder22);
                }
                int i23 = parcel.readInt();
                int i24 = parcel.readInt();
                int i25 = parcel.readInt();
                ifl.b(parcel);
                E(fniVar, i23, i24, i25);
                return true;
            case 3021:
                IBinder strongBinder23 = parcel.readStrongBinder();
                if (strongBinder23 != null) {
                    IInterface iInterfaceQueryLocalInterface20 = strongBinder23.queryLocalInterface("androidx.media3.session.IMediaController");
                    fniVar = iInterfaceQueryLocalInterface20 instanceof fnk ? (fnk) iInterfaceQueryLocalInterface20 : new fni(strongBinder23);
                }
                int i26 = parcel.readInt();
                ifl.b(parcel);
                h(fniVar, i26);
                return true;
            case 3022:
                IBinder strongBinder24 = parcel.readStrongBinder();
                if (strongBinder24 != null) {
                    IInterface iInterfaceQueryLocalInterface21 = strongBinder24.queryLocalInterface("androidx.media3.session.IMediaController");
                    fniVar = iInterfaceQueryLocalInterface21 instanceof fnk ? (fnk) iInterfaceQueryLocalInterface21 : new fni(strongBinder24);
                }
                int i27 = parcel.readInt();
                int i28 = parcel.readInt();
                int i29 = parcel.readInt();
                ifl.b(parcel);
                u(fniVar, i27, i28, i29);
                return true;
            case 3023:
                IBinder strongBinder25 = parcel.readStrongBinder();
                if (strongBinder25 != null) {
                    IInterface iInterfaceQueryLocalInterface22 = strongBinder25.queryLocalInterface("androidx.media3.session.IMediaController");
                    fniVar = iInterfaceQueryLocalInterface22 instanceof fnk ? (fnk) iInterfaceQueryLocalInterface22 : new fni(strongBinder25);
                }
                fnk fnkVar3 = fniVar;
                int i30 = parcel.readInt();
                int i31 = parcel.readInt();
                int i32 = parcel.readInt();
                int i33 = parcel.readInt();
                ifl.b(parcel);
                v(fnkVar3, i30, i31, i32, i33);
                return true;
            case 3024:
                IBinder strongBinder26 = parcel.readStrongBinder();
                if (strongBinder26 != null) {
                    IInterface iInterfaceQueryLocalInterface23 = strongBinder26.queryLocalInterface("androidx.media3.session.IMediaController");
                    fniVar = iInterfaceQueryLocalInterface23 instanceof fnk ? (fnk) iInterfaceQueryLocalInterface23 : new fni(strongBinder26);
                }
                int i34 = parcel.readInt();
                ifl.b(parcel);
                A(fniVar, i34);
                return true;
            case 3025:
                IBinder strongBinder27 = parcel.readStrongBinder();
                if (strongBinder27 != null) {
                    IInterface iInterfaceQueryLocalInterface24 = strongBinder27.queryLocalInterface("androidx.media3.session.IMediaController");
                    fniVar = iInterfaceQueryLocalInterface24 instanceof fnk ? (fnk) iInterfaceQueryLocalInterface24 : new fni(strongBinder27);
                }
                int i35 = parcel.readInt();
                ifl.b(parcel);
                y(fniVar, i35);
                return true;
            case 3026:
                IBinder strongBinder28 = parcel.readStrongBinder();
                if (strongBinder28 != null) {
                    IInterface iInterfaceQueryLocalInterface25 = strongBinder28.queryLocalInterface("androidx.media3.session.IMediaController");
                    fniVar = iInterfaceQueryLocalInterface25 instanceof fnk ? (fnk) iInterfaceQueryLocalInterface25 : new fni(strongBinder28);
                }
                int i36 = parcel.readInt();
                ifl.b(parcel);
                C(fniVar, i36);
                return true;
            case 3027:
                IBinder strongBinder29 = parcel.readStrongBinder();
                if (strongBinder29 != null) {
                    IInterface iInterfaceQueryLocalInterface26 = strongBinder29.queryLocalInterface("androidx.media3.session.IMediaController");
                    fniVar = iInterfaceQueryLocalInterface26 instanceof fnk ? (fnk) iInterfaceQueryLocalInterface26 : new fni(strongBinder29);
                }
                int i37 = parcel.readInt();
                Bundle bundle8 = (Bundle) ifl.a(parcel, Bundle.CREATOR);
                ifl.b(parcel);
                ai(fniVar, i37, bundle8);
                return true;
            case 3028:
                IBinder strongBinder30 = parcel.readStrongBinder();
                if (strongBinder30 != null) {
                    IInterface iInterfaceQueryLocalInterface27 = strongBinder30.queryLocalInterface("androidx.media3.session.IMediaController");
                    fniVar = iInterfaceQueryLocalInterface27 instanceof fnk ? (fnk) iInterfaceQueryLocalInterface27 : new fni(strongBinder30);
                }
                int i38 = parcel.readInt();
                float f2 = parcel.readFloat();
                ifl.b(parcel);
                aj(fniVar, i38, f2);
                return true;
            case 3029:
                IBinder strongBinder31 = parcel.readStrongBinder();
                if (strongBinder31 != null) {
                    IInterface iInterfaceQueryLocalInterface28 = strongBinder31.queryLocalInterface("androidx.media3.session.IMediaController");
                    fniVar = iInterfaceQueryLocalInterface28 instanceof fnk ? (fnk) iInterfaceQueryLocalInterface28 : new fni(strongBinder31);
                }
                int i39 = parcel.readInt();
                Bundle bundle9 = (Bundle) ifl.a(parcel, Bundle.CREATOR);
                ifl.b(parcel);
                d(fniVar, i39, bundle9);
                return true;
            case 3030:
                IBinder strongBinder32 = parcel.readStrongBinder();
                if (strongBinder32 != null) {
                    IInterface iInterfaceQueryLocalInterface29 = strongBinder32.queryLocalInterface("androidx.media3.session.IMediaController");
                    fniVar = iInterfaceQueryLocalInterface29 instanceof fnk ? (fnk) iInterfaceQueryLocalInterface29 : new fni(strongBinder32);
                }
                int i40 = parcel.readInt();
                int i41 = parcel.readInt();
                Bundle bundle10 = (Bundle) ifl.a(parcel, Bundle.CREATOR);
                ifl.b(parcel);
                e(fniVar, i40, i41, bundle10);
                return true;
            case 3031:
                IBinder strongBinder33 = parcel.readStrongBinder();
                if (strongBinder33 != null) {
                    IInterface iInterfaceQueryLocalInterface30 = strongBinder33.queryLocalInterface("androidx.media3.session.IMediaController");
                    fniVar = iInterfaceQueryLocalInterface30 instanceof fnk ? (fnk) iInterfaceQueryLocalInterface30 : new fni(strongBinder33);
                }
                int i42 = parcel.readInt();
                IBinder strongBinder34 = parcel.readStrongBinder();
                ifl.b(parcel);
                f(fniVar, i42, strongBinder34);
                return true;
            case 3032:
                IBinder strongBinder35 = parcel.readStrongBinder();
                if (strongBinder35 != null) {
                    IInterface iInterfaceQueryLocalInterface31 = strongBinder35.queryLocalInterface("androidx.media3.session.IMediaController");
                    fniVar = iInterfaceQueryLocalInterface31 instanceof fnk ? (fnk) iInterfaceQueryLocalInterface31 : new fni(strongBinder35);
                }
                int i43 = parcel.readInt();
                int i44 = parcel.readInt();
                IBinder strongBinder36 = parcel.readStrongBinder();
                ifl.b(parcel);
                g(fniVar, i43, i44, strongBinder36);
                return true;
            case 3033:
                IBinder strongBinder37 = parcel.readStrongBinder();
                if (strongBinder37 != null) {
                    IInterface iInterfaceQueryLocalInterface32 = strongBinder37.queryLocalInterface("androidx.media3.session.IMediaController");
                    fniVar = iInterfaceQueryLocalInterface32 instanceof fnk ? (fnk) iInterfaceQueryLocalInterface32 : new fni(strongBinder37);
                }
                int i45 = parcel.readInt();
                Bundle bundle11 = (Bundle) ifl.a(parcel, Bundle.CREATOR);
                ifl.b(parcel);
                ak(fniVar, i45, bundle11);
                return true;
            case 3034:
                IBinder strongBinder38 = parcel.readStrongBinder();
                if (strongBinder38 != null) {
                    IInterface iInterfaceQueryLocalInterface33 = strongBinder38.queryLocalInterface("androidx.media3.session.IMediaController");
                    fniVar = iInterfaceQueryLocalInterface33 instanceof fnk ? (fnk) iInterfaceQueryLocalInterface33 : new fni(strongBinder38);
                }
                int i46 = parcel.readInt();
                ifl.b(parcel);
                if (fniVar != null && (fnwVarJ = this.d.j(fniVar.asBinder())) != null) {
                    ar(fnwVarJ, i46);
                }
                return true;
            case 3035:
                IBinder strongBinder39 = parcel.readStrongBinder();
                if (strongBinder39 != null) {
                    IInterface iInterfaceQueryLocalInterface34 = strongBinder39.queryLocalInterface("androidx.media3.session.IMediaController");
                    fniVar = iInterfaceQueryLocalInterface34 instanceof fnk ? (fnk) iInterfaceQueryLocalInterface34 : new fni(strongBinder39);
                }
                parcel.readInt();
                ifl.b(parcel);
                au(fniVar);
                return true;
            case 3036:
                IBinder strongBinder40 = parcel.readStrongBinder();
                if (strongBinder40 != null) {
                    IInterface iInterfaceQueryLocalInterface35 = strongBinder40.queryLocalInterface("androidx.media3.session.IMediaController");
                    fniVar = iInterfaceQueryLocalInterface35 instanceof fnk ? (fnk) iInterfaceQueryLocalInterface35 : new fni(strongBinder40);
                }
                int i47 = parcel.readInt();
                ifl.b(parcel);
                N(fniVar, i47);
                return true;
            case 3037:
                IBinder strongBinder41 = parcel.readStrongBinder();
                if (strongBinder41 != null) {
                    IInterface iInterfaceQueryLocalInterface36 = strongBinder41.queryLocalInterface("androidx.media3.session.IMediaController");
                    fniVar = iInterfaceQueryLocalInterface36 instanceof fnk ? (fnk) iInterfaceQueryLocalInterface36 : new fni(strongBinder41);
                }
                int i48 = parcel.readInt();
                int i49 = parcel.readInt();
                ifl.b(parcel);
                O(fniVar, i48, i49);
                return true;
            case 3038:
                IBinder strongBinder42 = parcel.readStrongBinder();
                if (strongBinder42 != null) {
                    IInterface iInterfaceQueryLocalInterface37 = strongBinder42.queryLocalInterface("androidx.media3.session.IMediaController");
                    fniVar = iInterfaceQueryLocalInterface37 instanceof fnk ? (fnk) iInterfaceQueryLocalInterface37 : new fni(strongBinder42);
                }
                int i50 = parcel.readInt();
                long j3 = parcel.readLong();
                ifl.b(parcel);
                M(fniVar, i50, j3);
                return true;
            case 3039:
                IBinder strongBinder43 = parcel.readStrongBinder();
                if (strongBinder43 != null) {
                    IInterface iInterfaceQueryLocalInterface38 = strongBinder43.queryLocalInterface("androidx.media3.session.IMediaController");
                    fniVar = iInterfaceQueryLocalInterface38 instanceof fnk ? (fnk) iInterfaceQueryLocalInterface38 : new fni(strongBinder43);
                }
                fnk fnkVar4 = fniVar;
                int i51 = parcel.readInt();
                int i52 = parcel.readInt();
                long j4 = parcel.readLong();
                ifl.b(parcel);
                V(fnkVar4, i51, i52, j4);
                return true;
            case 3040:
                IBinder strongBinder44 = parcel.readStrongBinder();
                if (strongBinder44 != null) {
                    IInterface iInterfaceQueryLocalInterface39 = strongBinder44.queryLocalInterface("androidx.media3.session.IMediaController");
                    fniVar = iInterfaceQueryLocalInterface39 instanceof fnk ? (fnk) iInterfaceQueryLocalInterface39 : new fni(strongBinder44);
                }
                int i53 = parcel.readInt();
                ifl.b(parcel);
                I(fniVar, i53);
                return true;
            case 3041:
                IBinder strongBinder45 = parcel.readStrongBinder();
                if (strongBinder45 != null) {
                    IInterface iInterfaceQueryLocalInterface40 = strongBinder45.queryLocalInterface("androidx.media3.session.IMediaController");
                    fniVar = iInterfaceQueryLocalInterface40 instanceof fnk ? (fnk) iInterfaceQueryLocalInterface40 : new fni(strongBinder45);
                }
                int i54 = parcel.readInt();
                ifl.b(parcel);
                K(fniVar, i54);
                return true;
            case 3042:
                IBinder strongBinder46 = parcel.readStrongBinder();
                if (strongBinder46 != null) {
                    IInterface iInterfaceQueryLocalInterface41 = strongBinder46.queryLocalInterface("androidx.media3.session.IMediaController");
                    fniVar = iInterfaceQueryLocalInterface41 instanceof fnk ? (fnk) iInterfaceQueryLocalInterface41 : new fni(strongBinder46);
                }
                int i55 = parcel.readInt();
                ifl.b(parcel);
                U(fniVar, i55);
                return true;
            case 3043:
                IBinder strongBinder47 = parcel.readStrongBinder();
                if (strongBinder47 != null) {
                    IInterface iInterfaceQueryLocalInterface42 = strongBinder47.queryLocalInterface("androidx.media3.session.IMediaController");
                    fniVar = iInterfaceQueryLocalInterface42 instanceof fnk ? (fnk) iInterfaceQueryLocalInterface42 : new fni(strongBinder47);
                }
                int i56 = parcel.readInt();
                ifl.b(parcel);
                R(fniVar, i56);
                return true;
            case 3044:
                IBinder strongBinder48 = parcel.readStrongBinder();
                if (strongBinder48 != null) {
                    IInterface iInterfaceQueryLocalInterface43 = strongBinder48.queryLocalInterface("androidx.media3.session.IMediaController");
                    fniVar = iInterfaceQueryLocalInterface43 instanceof fnk ? (fnk) iInterfaceQueryLocalInterface43 : new fni(strongBinder48);
                }
                int i57 = parcel.readInt();
                Surface surface = (Surface) ifl.a(parcel, Surface.CREATOR);
                ifl.b(parcel);
                if (fniVar != null) {
                    ay(fniVar, i57, 27, av(new fja(surface, 3)));
                }
                return true;
            case 3045:
                IBinder strongBinder49 = parcel.readStrongBinder();
                if (strongBinder49 != null) {
                    IInterface iInterfaceQueryLocalInterface44 = strongBinder49.queryLocalInterface("androidx.media3.session.IMediaController");
                    fniVar = iInterfaceQueryLocalInterface44 instanceof fnk ? (fnk) iInterfaceQueryLocalInterface44 : new fni(strongBinder49);
                }
                ifl.b(parcel);
                l(fniVar);
                return true;
            case 3046:
                IBinder strongBinder50 = parcel.readStrongBinder();
                if (strongBinder50 != null) {
                    IInterface iInterfaceQueryLocalInterface45 = strongBinder50.queryLocalInterface("androidx.media3.session.IMediaController");
                    fniVar = iInterfaceQueryLocalInterface45 instanceof fnk ? (fnk) iInterfaceQueryLocalInterface45 : new fni(strongBinder50);
                }
                int i58 = parcel.readInt();
                ifl.b(parcel);
                S(fniVar, i58);
                return true;
            case 3047:
                IBinder strongBinder51 = parcel.readStrongBinder();
                if (strongBinder51 != null) {
                    IInterface iInterfaceQueryLocalInterface46 = strongBinder51.queryLocalInterface("androidx.media3.session.IMediaController");
                    fniVar = iInterfaceQueryLocalInterface46 instanceof fnk ? (fnk) iInterfaceQueryLocalInterface46 : new fni(strongBinder51);
                }
                int i59 = parcel.readInt();
                ifl.b(parcel);
                P(fniVar, i59);
                return true;
            case 3048:
                IBinder strongBinder52 = parcel.readStrongBinder();
                if (strongBinder52 != null) {
                    IInterface iInterfaceQueryLocalInterface47 = strongBinder52.queryLocalInterface("androidx.media3.session.IMediaController");
                    fniVar = iInterfaceQueryLocalInterface47 instanceof fnk ? (fnk) iInterfaceQueryLocalInterface47 : new fni(strongBinder52);
                }
                int i60 = parcel.readInt();
                Bundle bundle12 = (Bundle) ifl.a(parcel, Bundle.CREATOR);
                ifl.b(parcel);
                ap(fniVar, i60, bundle12);
                return true;
            case 3049:
                IBinder strongBinder53 = parcel.readStrongBinder();
                if (strongBinder53 != null) {
                    IInterface iInterfaceQueryLocalInterface48 = strongBinder53.queryLocalInterface("androidx.media3.session.IMediaController");
                    fniVar = iInterfaceQueryLocalInterface48 instanceof fnk ? (fnk) iInterfaceQueryLocalInterface48 : new fni(strongBinder53);
                }
                int i61 = parcel.readInt();
                String string = parcel.readString();
                Bundle bundle13 = (Bundle) ifl.a(parcel, Bundle.CREATOR);
                ifl.b(parcel);
                am(fniVar, i61, string, bundle13);
                return true;
            case 3050:
                IBinder strongBinder54 = parcel.readStrongBinder();
                if (strongBinder54 != null) {
                    IInterface iInterfaceQueryLocalInterface49 = strongBinder54.queryLocalInterface("androidx.media3.session.IMediaController");
                    fniVar = iInterfaceQueryLocalInterface49 instanceof fnk ? (fnk) iInterfaceQueryLocalInterface49 : new fni(strongBinder54);
                }
                int i62 = parcel.readInt();
                Bundle bundle14 = (Bundle) ifl.a(parcel, Bundle.CREATOR);
                ifl.b(parcel);
                al(fniVar, i62, bundle14);
                return true;
            case 3051:
                IBinder strongBinder55 = parcel.readStrongBinder();
                if (strongBinder55 != null) {
                    IInterface iInterfaceQueryLocalInterface50 = strongBinder55.queryLocalInterface("androidx.media3.session.IMediaController");
                    fniVar = iInterfaceQueryLocalInterface50 instanceof fnk ? (fnk) iInterfaceQueryLocalInterface50 : new fni(strongBinder55);
                }
                int i63 = parcel.readInt();
                int i64 = parcel.readInt();
                int i65 = parcel.readInt();
                ifl.b(parcel);
                ab(fniVar, i63, i64, i65);
                return true;
            case 3052:
                IBinder strongBinder56 = parcel.readStrongBinder();
                if (strongBinder56 != null) {
                    IInterface iInterfaceQueryLocalInterface51 = strongBinder56.queryLocalInterface("androidx.media3.session.IMediaController");
                    fniVar = iInterfaceQueryLocalInterface51 instanceof fnk ? (fnk) iInterfaceQueryLocalInterface51 : new fni(strongBinder56);
                }
                int i66 = parcel.readInt();
                int i67 = parcel.readInt();
                ifl.b(parcel);
                r(fniVar, i66, i67);
                return true;
            case 3053:
                IBinder strongBinder57 = parcel.readStrongBinder();
                if (strongBinder57 != null) {
                    IInterface iInterfaceQueryLocalInterface52 = strongBinder57.queryLocalInterface("androidx.media3.session.IMediaController");
                    fniVar = iInterfaceQueryLocalInterface52 instanceof fnk ? (fnk) iInterfaceQueryLocalInterface52 : new fni(strongBinder57);
                }
                int i68 = parcel.readInt();
                int i69 = parcel.readInt();
                ifl.b(parcel);
                j(fniVar, i68, i69);
                return true;
            case 3054:
                IBinder strongBinder58 = parcel.readStrongBinder();
                if (strongBinder58 != null) {
                    IInterface iInterfaceQueryLocalInterface53 = strongBinder58.queryLocalInterface("androidx.media3.session.IMediaController");
                    fniVar = iInterfaceQueryLocalInterface53 instanceof fnk ? (fnk) iInterfaceQueryLocalInterface53 : new fni(strongBinder58);
                }
                int i70 = parcel.readInt();
                boolean zF6 = ifl.f(parcel);
                int i71 = parcel.readInt();
                ifl.b(parcel);
                Z(fniVar, i70, zF6, i71);
                return true;
            case 3055:
                IBinder strongBinder59 = parcel.readStrongBinder();
                if (strongBinder59 != null) {
                    IInterface iInterfaceQueryLocalInterface54 = strongBinder59.queryLocalInterface("androidx.media3.session.IMediaController");
                    fniVar = iInterfaceQueryLocalInterface54 instanceof fnk ? (fnk) iInterfaceQueryLocalInterface54 : new fni(strongBinder59);
                }
                int i72 = parcel.readInt();
                int i73 = parcel.readInt();
                Bundle bundle15 = (Bundle) ifl.a(parcel, Bundle.CREATOR);
                ifl.b(parcel);
                F(fniVar, i72, i73, bundle15);
                return true;
            case 3056:
                IBinder strongBinder60 = parcel.readStrongBinder();
                if (strongBinder60 != null) {
                    IInterface iInterfaceQueryLocalInterface55 = strongBinder60.queryLocalInterface("androidx.media3.session.IMediaController");
                    fniVar = iInterfaceQueryLocalInterface55 instanceof fnk ? (fnk) iInterfaceQueryLocalInterface55 : new fni(strongBinder60);
                }
                int i74 = parcel.readInt();
                int i75 = parcel.readInt();
                int i76 = parcel.readInt();
                IBinder strongBinder61 = parcel.readStrongBinder();
                ifl.b(parcel);
                G(fniVar, i74, i75, i76, strongBinder61);
                return true;
            case 3057:
                IBinder strongBinder62 = parcel.readStrongBinder();
                if (strongBinder62 != null) {
                    IInterface iInterfaceQueryLocalInterface56 = strongBinder62.queryLocalInterface("androidx.media3.session.IMediaController");
                    fniVar = iInterfaceQueryLocalInterface56 instanceof fnk ? (fnk) iInterfaceQueryLocalInterface56 : new fni(strongBinder62);
                }
                int i77 = parcel.readInt();
                Bundle bundle16 = (Bundle) ifl.a(parcel, Bundle.CREATOR);
                boolean zF7 = ifl.f(parcel);
                ifl.b(parcel);
                X(fniVar, i77, bundle16, zF7);
                return true;
            default:
                int i78 = 0;
                switch (i) {
                    case 4001:
                        IBinder strongBinder63 = parcel.readStrongBinder();
                        if (strongBinder63 != null) {
                            IInterface iInterfaceQueryLocalInterface57 = strongBinder63.queryLocalInterface("androidx.media3.session.IMediaController");
                            fniVar = iInterfaceQueryLocalInterface57 instanceof fnk ? (fnk) iInterfaceQueryLocalInterface57 : new fni(strongBinder63);
                        }
                        int i79 = parcel.readInt();
                        Bundle bundle17 = (Bundle) ifl.a(parcel, Bundle.CREATOR);
                        ifl.b(parcel);
                        o(fniVar, i79, bundle17);
                        return true;
                    case 4002:
                        IBinder strongBinder64 = parcel.readStrongBinder();
                        if (strongBinder64 != null) {
                            IInterface iInterfaceQueryLocalInterface58 = strongBinder64.queryLocalInterface("androidx.media3.session.IMediaController");
                            fniVar = iInterfaceQueryLocalInterface58 instanceof fnk ? (fnk) iInterfaceQueryLocalInterface58 : new fni(strongBinder64);
                        }
                        int i80 = parcel.readInt();
                        String string2 = parcel.readString();
                        ifl.b(parcel);
                        n(fniVar, i80, string2);
                        return true;
                    case 4003:
                        IBinder strongBinder65 = parcel.readStrongBinder();
                        if (strongBinder65 != null) {
                            IInterface iInterfaceQueryLocalInterface59 = strongBinder65.queryLocalInterface("androidx.media3.session.IMediaController");
                            fniVar = iInterfaceQueryLocalInterface59 instanceof fnk ? (fnk) iInterfaceQueryLocalInterface59 : new fni(strongBinder65);
                        }
                        int i81 = parcel.readInt();
                        String string3 = parcel.readString();
                        int i82 = parcel.readInt();
                        int i83 = parcel.readInt();
                        Bundle bundle18 = (Bundle) ifl.a(parcel, Bundle.CREATOR);
                        ifl.b(parcel);
                        m(fniVar, i81, string3, i82, i83, bundle18);
                        return true;
                    case 4004:
                        IBinder strongBinder66 = parcel.readStrongBinder();
                        if (strongBinder66 != null) {
                            IInterface iInterfaceQueryLocalInterface60 = strongBinder66.queryLocalInterface("androidx.media3.session.IMediaController");
                            fniVar = iInterfaceQueryLocalInterface60 instanceof fnk ? (fnk) iInterfaceQueryLocalInterface60 : new fni(strongBinder66);
                        }
                        int i84 = parcel.readInt();
                        String string4 = parcel.readString();
                        Bundle bundle19 = (Bundle) ifl.a(parcel, Bundle.CREATOR);
                        ifl.b(parcel);
                        H(fniVar, i84, string4, bundle19);
                        return true;
                    case 4005:
                        IBinder strongBinder67 = parcel.readStrongBinder();
                        if (strongBinder67 != null) {
                            IInterface iInterfaceQueryLocalInterface61 = strongBinder67.queryLocalInterface("androidx.media3.session.IMediaController");
                            fniVar = iInterfaceQueryLocalInterface61 instanceof fnk ? (fnk) iInterfaceQueryLocalInterface61 : new fni(strongBinder67);
                        }
                        int i85 = parcel.readInt();
                        String string5 = parcel.readString();
                        int i86 = parcel.readInt();
                        int i87 = parcel.readInt();
                        Bundle bundle20 = (Bundle) ifl.a(parcel, Bundle.CREATOR);
                        ifl.b(parcel);
                        p(fniVar, i85, string5, i86, i87, bundle20);
                        return true;
                    case 4006:
                        IBinder strongBinder68 = parcel.readStrongBinder();
                        if (strongBinder68 != null) {
                            IInterface iInterfaceQueryLocalInterface62 = strongBinder68.queryLocalInterface("androidx.media3.session.IMediaController");
                            fniVar = iInterfaceQueryLocalInterface62 instanceof fnk ? (fnk) iInterfaceQueryLocalInterface62 : new fni(strongBinder68);
                        }
                        int i88 = parcel.readInt();
                        String string6 = parcel.readString();
                        Bundle bundle21 = (Bundle) ifl.a(parcel, Bundle.CREATOR);
                        ifl.b(parcel);
                        as(fniVar, i88, string6, bundle21);
                        return true;
                    case 4007:
                        IBinder strongBinder69 = parcel.readStrongBinder();
                        if (strongBinder69 != null) {
                            IInterface iInterfaceQueryLocalInterface63 = strongBinder69.queryLocalInterface("androidx.media3.session.IMediaController");
                            fniVar = iInterfaceQueryLocalInterface63 instanceof fnk ? (fnk) iInterfaceQueryLocalInterface63 : new fni(strongBinder69);
                        }
                        int i89 = parcel.readInt();
                        String string7 = parcel.readString();
                        ifl.b(parcel);
                        if (fniVar != null) {
                            if (TextUtils.isEmpty(string7)) {
                                edb.e("MediaSessionStub", "unsubscribe(): Ignoring empty parentId");
                            } else {
                                aw(fniVar, i89, 50002, new fpj(new fpi(i78), 7));
                            }
                        }
                        return true;
                    default:
                        return false;
                }
        }
    }

    public final void l(fnk fnkVar) {
        fnw fnwVarJ;
        if (fnkVar == null) {
            return;
        }
        long jClearCallingIdentity = Binder.clearCallingIdentity();
        try {
            foo fooVar = (foo) this.a.get();
            if (fooVar != null && !fooVar.s() && (fnwVarJ = this.d.j(fnkVar.asBinder())) != null) {
                edt.aB(fooVar.k, new foa(this, fnwVarJ, 13, null));
            }
        } finally {
            Binder.restoreCallingIdentity(jClearCallingIdentity);
        }
    }

    public final void m(fnk fnkVar, int i, String str, int i2, int i3, Bundle bundle) {
        if (fnkVar == null) {
            return;
        }
        if (TextUtils.isEmpty(str)) {
            edb.e("MediaSessionStub", "getChildren(): Ignoring empty parentId");
            return;
        }
        if (i2 < 0) {
            edb.e("MediaSessionStub", "getChildren(): Ignoring negative page");
            return;
        }
        if (i3 <= 0) {
            edb.e("MediaSessionStub", "getChildren(): Ignoring pageSize less than 1");
            return;
        }
        if (bundle != null) {
            try {
                fno.a(bundle);
            } catch (RuntimeException e) {
                edb.f("MediaSessionStub", "Ignoring malformed Bundle for LibraryParams", e);
                return;
            }
        }
        aw(fnkVar, i, 50003, new fpj(new fpi(2), 7));
    }

    public final void n(fnk fnkVar, int i, String str) {
        if (fnkVar == null) {
            return;
        }
        if (TextUtils.isEmpty(str)) {
            edb.e("MediaSessionStub", "getItem(): Ignoring empty mediaId");
        } else {
            aw(fnkVar, i, 50004, new fpj(new fpi(3), 7));
        }
    }

    public final void o(fnk fnkVar, int i, Bundle bundle) {
        if (fnkVar == null) {
            return;
        }
        if (bundle != null) {
            try {
                fno.a(bundle);
            } catch (RuntimeException e) {
                edb.f("MediaSessionStub", "Ignoring malformed Bundle for LibraryParams", e);
                return;
            }
        }
        aw(fnkVar, i, 50000, new fpj(new fpi(5), 7));
    }

    public final void p(fnk fnkVar, int i, String str, int i2, int i3, Bundle bundle) {
        if (fnkVar == null) {
            return;
        }
        if (TextUtils.isEmpty(str)) {
            edb.e("MediaSessionStub", "getSearchResult(): Ignoring empty query");
            return;
        }
        if (i2 < 0) {
            edb.e("MediaSessionStub", "getSearchResult(): Ignoring negative page");
            return;
        }
        if (i3 <= 0) {
            edb.e("MediaSessionStub", "getSearchResult(): Ignoring pageSize less than 1");
            return;
        }
        if (bundle != null) {
            try {
                fno.a(bundle);
            } catch (RuntimeException e) {
                edb.f("MediaSessionStub", "Ignoring malformed Bundle for LibraryParams", e);
                return;
            }
        }
        aw(fnkVar, i, 50006, new fpj(new fpi(4), 7));
    }

    public final void q(fnk fnkVar, int i) {
        if (fnkVar == null) {
            return;
        }
        ay(fnkVar, i, 26, av(new eoj(11)));
    }

    public final void r(fnk fnkVar, int i, int i2) {
        if (fnkVar == null) {
            return;
        }
        ay(fnkVar, i, 34, av(new eoj(15)));
    }

    public final void u(fnk fnkVar, int i, final int i2, final int i3) {
        if (fnkVar == null || i2 < 0 || i3 < 0) {
            return;
        }
        ay(fnkVar, i, 20, av(new ecq() { // from class: fqh
            @Override // defpackage.ecq
            public final void a(Object obj) {
                fqt fqtVar = (fqt) obj;
                fqtVar.aC();
                int i4 = i2;
                int i5 = i3;
                if (i4 != i5) {
                    ((dyq) fqtVar.a).V(i4, i4 + 1, i5);
                }
            }
        }));
    }

    public final void v(fnk fnkVar, int i, final int i2, final int i3, final int i4) {
        if (fnkVar == null || i2 < 0 || i3 < i2 || i4 < 0) {
            return;
        }
        ay(fnkVar, i, 20, av(new ecq() { // from class: fpr
            @Override // defpackage.ecq
            public final void a(Object obj) {
                fqt fqtVar = (fqt) obj;
                fqtVar.aC();
                fqtVar.a.V(i2, i3, i4);
            }
        }));
    }

    public final void w(fnk fnkVar, int i, Bundle bundle) {
        fqy fqyVar;
        fnf fnfVar;
        if (fnkVar == null || bundle == null) {
            return;
        }
        try {
            int i2 = bundle.getInt(fra.a, -1);
            Bundle bundle2 = bundle.getBundle(fra.b);
            long j = bundle.getLong(fra.c, SystemClock.elapsedRealtime());
            Bundle bundle3 = bundle.getBundle(fra.d);
            if (bundle3 != null) {
                int i3 = bundle3.getInt(fqy.a, 1000);
                String string = bundle3.getString(fqy.b, "");
                Bundle bundle4 = bundle3.getBundle(fqy.c);
                if (bundle4 == null) {
                    bundle4 = Bundle.EMPTY;
                }
                fqyVar = new fqy(i3, string, bundle4);
            } else {
                fqyVar = i2 != 0 ? new fqy(i2) : null;
            }
            if (bundle2 == null) {
                bundle2 = Bundle.EMPTY;
            }
            fra fraVar = new fra(i2, bundle2, j, fqyVar);
            long jClearCallingIdentity = Binder.clearCallingIdentity();
            try {
                iom iomVar = this.d;
                IBinder iBinderAsBinder = fnkVar.asBinder();
                synchronized (iomVar.a) {
                    fnw fnwVarJ = iomVar.j(iBinderAsBinder);
                    fnfVar = fnwVarJ != null ? (fnf) ((ko) iomVar.d).get(fnwVarJ) : null;
                }
                fqv fqvVar = fnfVar != null ? fnfVar.b : null;
                if (fqvVar != null) {
                    synchronized (fqvVar.a) {
                        fqu fquVar = (fqu) ((ko) fqvVar.d).remove(Integer.valueOf(i));
                        if (fquVar != null) {
                            Object obj = fquVar.b;
                            if (obj.getClass() == fraVar.getClass()) {
                                fquVar.b(fraVar);
                            } else {
                                edb.e("SequencedFutureManager", "Type mismatch, expected " + String.valueOf(obj.getClass()) + ", but was " + String.valueOf(fraVar.getClass()));
                            }
                        }
                    }
                }
            } finally {
                Binder.restoreCallingIdentity(jClearCallingIdentity);
            }
        } catch (RuntimeException e) {
            edb.f("MediaSessionStub", "Ignoring malformed Bundle for SessionResult", e);
        }
    }

    public final void x(fnk fnkVar, int i, Bundle bundle, Bundle bundle2) {
        fqw fqwVar;
        if (fnkVar == null || bundle == null || bundle2 == null) {
            return;
        }
        try {
            int i2 = bundle.getInt(fqw.c, 0);
            if (i2 != 0) {
                fqwVar = new fqw(i2);
            } else {
                String string = bundle.getString(fqw.d);
                string.getClass();
                Bundle bundle3 = bundle.getBundle(fqw.e);
                if (bundle3 == null) {
                    bundle3 = Bundle.EMPTY;
                }
                fqwVar = new fqw(string, bundle3);
            }
            ax(fnkVar, i, fqwVar, 0, new fpj(new fpt(fqwVar, bundle2, 1), 8));
        } catch (RuntimeException e) {
            edb.f("MediaSessionStub", "Ignoring malformed Bundle for SessionCommand", e);
        }
    }

    public final void y(fnk fnkVar, int i) {
        fnw fnwVarJ;
        if (fnkVar == null || (fnwVarJ = this.d.j(fnkVar.asBinder())) == null) {
            return;
        }
        z(fnwVarJ, i);
    }

    public final void z(fnw fnwVar, int i) {
        az(fnwVar, i, 1, av(new eoj(9)));
    }

    public fnl(foo fooVar) {
        super("androidx.media3.session.IMediaSession");
        this.a = new WeakReference(fooVar);
        this.d = new iom(fooVar);
        this.b = DesugarCollections.synchronizedSet(new HashSet());
        this.c = ImmutableBiMap.of();
    }
}
