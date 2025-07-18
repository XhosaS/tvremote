package defpackage;

import android.graphics.Bitmap;
import android.media.session.MediaController;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.RemoteCallbackList;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fpe implements fnv {
    public final /* synthetic */ fph a;
    private Uri d;
    private eab b = eab.a;
    private String c = "";
    private long e = -9223372036854775807L;

    public fpe(fph fphVar) {
        this.a = fphVar;
    }

    private final void G() {
        uhp uhpVarM;
        Object obj;
        fpe fpeVar;
        long j;
        Uri uri;
        eab eabVar;
        Uri uri2;
        fph fphVar = this.a;
        foo fooVar = fphVar.b;
        fqt fqtVar = fooVar.q;
        dzy dzyVarAs = fqtVar.as();
        eab eabVarAt = fqtVar.at();
        long jE = -9223372036854775807L;
        if ((!fqtVar.q(16) || !fqtVar.s()) && fqtVar.q(16)) {
            jE = fqtVar.E();
        }
        String str = dzyVarAs != null ? dzyVarAs.b : "";
        Bitmap bitmap = null;
        Uri uri3 = (dzyVarAs == null || (uri2 = dzyVarAs.g.e) == null) ? null : uri2;
        if (Objects.equals(this.b, eabVarAt) && Objects.equals(this.c, str) && Objects.equals(this.d, uri3) && this.e == jE) {
            return;
        }
        this.c = str;
        this.d = uri3;
        this.b = eabVarAt;
        this.e = jE;
        ecl eclVar = fooVar.l;
        byte[] bArr = eabVarAt.l;
        if (bArr != null) {
            uhpVarM = eclVar.a(bArr);
        } else {
            Uri uri4 = eabVarAt.n;
            if (uri4 != null) {
                fna fnaVar = (fna) eclVar;
                cvi cviVar = fnaVar.b;
                if (cviVar == null || (obj = cviVar.c) == null || !((Uri) obj).equals(uri4)) {
                    ecl eclVar2 = fnaVar.a;
                    uhp uhpVarSubmit = ((eeu) eclVar2).b.submit(new grz(eclVar2, uri4, 1));
                    fnaVar.b = new cvi(uri4, uhpVarSubmit);
                    uhpVarM = uhpVarSubmit;
                } else {
                    uhpVarM = fnaVar.b.M();
                }
            } else {
                uhpVarM = null;
            }
        }
        if (uhpVarM != null) {
            fphVar.g = null;
            if (uhpVarM.isDone()) {
                try {
                    fpeVar = this;
                    bitmap = (Bitmap) sfy.J(uhpVarM);
                } catch (CancellationException | ExecutionException e) {
                    edb.e("MediaSessionLegacyStub", fph.c(e));
                }
                j = jE;
                uri = uri3;
                eabVar = eabVarAt;
            } else {
                fph fphVar2 = this.a;
                j = jE;
                uri = uri3;
                eabVar = eabVarAt;
                fpd fpdVar = new fpd(this, eabVar, str, uri, j);
                fpeVar = this;
                str = str;
                fphVar2.g = fpdVar;
                foo fooVar2 = fphVar2.b;
                uha uhaVar = fphVar2.g;
                Handler handler = fooVar2.k;
                handler.getClass();
                sfy.K(uhpVarM, uhaVar, new emk(handler, 5));
            }
        } else {
            fpeVar = this;
            j = jE;
            uri = uri3;
            eabVar = eabVarAt;
        }
        fpeVar.a.d.h(fnm.f(eabVar, str, uri, j, bitmap));
    }

    @Override // defpackage.fnv
    public final void C(fqt fqtVar) {
        x(fqtVar.aw());
        t(fqtVar.au());
        fqtVar.at();
        n();
        w(fqtVar.am());
        v(fqtVar.bh());
        fqtVar.aq();
        i();
        this.a.f(fqtVar);
        m(fqtVar.as());
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x014b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void D(java.util.List r23, java.util.List r24) {
        /*
            Method dump skipped, instructions count: 428
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fpe.D(java.util.List, java.util.List):void");
    }

    public final void E(eay eayVar) {
        fph fphVar = this.a;
        if (!fphVar.H() || eayVar.q()) {
            fphVar.d.k(null);
            return;
        }
        int i = fnm.a;
        ArrayList arrayList = new ArrayList();
        eax eaxVar = new eax();
        for (int i2 = 0; i2 < eayVar.c(); i2++) {
            arrayList.add(eayVar.p(i2, eaxVar).q);
        }
        ArrayList arrayList2 = new ArrayList();
        ejr ejrVar = new ejr((Object) this, (Object) new AtomicInteger(0), (Object) arrayList, (Object) arrayList2, 5, (byte[]) null);
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            byte[] bArr = ((dzy) arrayList.get(i3)).e.l;
            if (bArr == null) {
                arrayList2.add(null);
                ejrVar.run();
            } else {
                foo fooVar = fphVar.b;
                uhp uhpVarA = fooVar.l.a(bArr);
                arrayList2.add(uhpVarA);
                Handler handler = fooVar.k;
                handler.getClass();
                uhpVarA.c(ejrVar, new emk(handler, 5));
            }
        }
    }

    public final boolean F() {
        return this.a.m != null;
    }

    @Override // defpackage.fnv
    public final void a(int i, eak eakVar) {
        if (F()) {
            return;
        }
        fph fphVar = this.a;
        fqt fqtVar = fphVar.b.q;
        fphVar.f(fqtVar);
        fphVar.G(fqtVar);
    }

    @Override // defpackage.fnv
    public final void c(int i, fqz fqzVar, boolean z, boolean z2, int i2) {
        if (F()) {
            return;
        }
        fph fphVar = this.a;
        fphVar.G(fphVar.b.q);
    }

    @Override // defpackage.fnv
    public final void g(int i, fqw fqwVar, Bundle bundle) {
        String str = fqwVar.g;
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("event cannot be null or empty");
        }
        ((frx) this.a.d.b).a.sendSessionEvent(str, bundle);
    }

    @Override // defpackage.fnv
    public final void h(dyo dyoVar) {
        fph fphVar = this.a;
        int i = fphVar.b.q.aq().b;
        fphVar.d.j(fnm.a(dyoVar));
    }

    @Override // defpackage.fnv
    public final void i() {
        fph fphVar = this.a;
        fqt fqtVar = fphVar.b.q;
        int i = fqtVar.aq().b;
        fphVar.d.j(fnm.a(fqtVar.ap()));
    }

    @Override // defpackage.fnv
    public final void l() {
        cvi.N(this);
    }

    @Override // defpackage.fnv
    public final void m(dzy dzyVar) {
        if (F()) {
            return;
        }
        G();
        if (dzyVar == null) {
            this.a.d.l(0);
        } else {
            fph fphVar = this.a;
            fphVar.d.l(fnm.b(dzyVar.e.j));
        }
        fph fphVar2 = this.a;
        fphVar2.G(fphVar2.b.q);
    }

    @Override // defpackage.fnv
    public final void n() {
        if (F()) {
            return;
        }
        G();
    }

    @Override // defpackage.fnv
    public final void o() {
        cvi.N(this);
    }

    @Override // defpackage.fnv
    public final void p() {
        cvi.N(this);
    }

    @Override // defpackage.fnv
    public final void q() {
        cvi.N(this);
    }

    @Override // defpackage.fnv
    public final void r() {
        cvi.N(this);
    }

    @Override // defpackage.fnv
    public final void s() {
        cvi.N(this);
    }

    @Override // defpackage.fnv
    public final void t(eab eabVar) {
        if (F()) {
            return;
        }
        fph fphVar = this.a;
        fse fseVar = fphVar.d;
        CharSequence queueTitle = ((MediaController) ((gag) ((dxc) fseVar.a).a).c).getQueueTitle();
        CharSequence charSequence = eabVar.b;
        if (TextUtils.equals(queueTitle, charSequence)) {
            return;
        }
        if (true != fphVar.H()) {
            charSequence = null;
        }
        ((frx) fseVar.b).a.setQueueTitle(charSequence);
    }

    @Override // defpackage.fnv
    public final void u() {
        cvi.N(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0024 A[PHI: r1
  0x0024: PHI (r1v4 int) = (r1v3 int), (r1v5 int) binds: [B:5:0x0006, B:7:0x0009] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // defpackage.fnv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void v(int r8) {
        /*
            r7 = this;
            int r0 = defpackage.fnm.a
            r0 = 0
            if (r8 == 0) goto L25
            r1 = 1
            if (r8 == r1) goto L24
            r1 = 2
            if (r8 == r1) goto L24
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Unrecognized RepeatMode: "
            r1.<init>(r2)
            r1.append(r8)
            java.lang.String r8 = " was converted to `PlaybackStateCompat.REPEAT_MODE_NONE`"
            r1.append(r8)
            java.lang.String r8 = r1.toString()
            java.lang.String r1 = "LegacyConversions"
            defpackage.edb.e(r1, r8)
            goto L25
        L24:
            r0 = r1
        L25:
            fph r8 = r7.a
            fse r8 = r8.d
            java.lang.Object r8 = r8.b
            r1 = r8
            frx r1 = (defpackage.frx) r1
            int r2 = r1.i
            if (r2 == r0) goto L65
            r1.i = r0
            java.lang.Object r1 = r1.c
            monitor-enter(r1)
            r2 = r8
            frx r2 = (defpackage.frx) r2     // Catch: java.lang.Throwable -> L62
            android.os.RemoteCallbackList r2 = r2.e     // Catch: java.lang.Throwable -> L62
            int r3 = r2.beginBroadcast()     // Catch: java.lang.Throwable -> L62
        L40:
            int r3 = r3 + (-1)
            if (r3 < 0) goto L59
            android.os.IInterface r4 = r2.getBroadcastItem(r3)     // Catch: java.lang.Throwable -> L62
            frk r4 = (defpackage.frk) r4     // Catch: java.lang.Throwable -> L62
            r4.b(r0)     // Catch: java.lang.SecurityException -> L4e android.os.RemoteException -> L50 java.lang.Throwable -> L62
            goto L40
        L4e:
            r4 = move-exception
            goto L51
        L50:
            r4 = move-exception
        L51:
            java.lang.String r5 = "MediaSessionCompat"
            java.lang.String r6 = "Dead object in setRepeatMode."
            android.util.Log.e(r5, r6, r4)     // Catch: java.lang.Throwable -> L62
            goto L40
        L59:
            frx r8 = (defpackage.frx) r8     // Catch: java.lang.Throwable -> L62
            android.os.RemoteCallbackList r8 = r8.e     // Catch: java.lang.Throwable -> L62
            r8.finishBroadcast()     // Catch: java.lang.Throwable -> L62
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L62
            goto L65
        L62:
            r8 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L62
            throw r8
        L65:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fpe.v(int):void");
    }

    @Override // defpackage.fnv
    public final void w(boolean z) {
        int i = fnm.a;
        Object obj = this.a.d.b;
        frx frxVar = (frx) obj;
        if (frxVar.j != z) {
            frxVar.j = z ? 1 : 0;
            synchronized (frxVar.c) {
                RemoteCallbackList remoteCallbackList = ((frx) obj).e;
                int iBeginBroadcast = remoteCallbackList.beginBroadcast();
                while (true) {
                    iBeginBroadcast--;
                    if (iBeginBroadcast >= 0) {
                        try {
                            ((frk) remoteCallbackList.getBroadcastItem(iBeginBroadcast)).c(z ? 1 : 0);
                        } catch (RemoteException | SecurityException e) {
                            Log.e("MediaSessionCompat", "Dead object in setShuffleMode.", e);
                        }
                    } else {
                        ((frx) obj).e.finishBroadcast();
                    }
                }
            }
        }
    }

    @Override // defpackage.fnv
    public final void x(eay eayVar) {
        if (F()) {
            return;
        }
        E(eayVar);
        G();
    }

    @Override // defpackage.fnv
    public final /* synthetic */ void A() {
    }

    @Override // defpackage.fnv
    public final /* synthetic */ void B() {
    }

    @Override // defpackage.fnv
    public final void j() {
    }

    @Override // defpackage.fnv
    public final /* synthetic */ void k() {
    }

    @Override // defpackage.fnv
    public final /* synthetic */ void y() {
    }

    @Override // defpackage.fnv
    public final /* synthetic */ void z() {
    }

    @Override // defpackage.fnv
    public final /* synthetic */ void e(int i) {
    }

    @Override // defpackage.fnv
    public final /* synthetic */ void b(int i, fnn fnnVar) {
    }

    @Override // defpackage.fnv
    public final /* synthetic */ void f(int i, fra fraVar) {
    }

    @Override // defpackage.fnv
    public final /* synthetic */ void d(int i, fqr fqrVar, eak eakVar, boolean z, boolean z2) {
    }
}
