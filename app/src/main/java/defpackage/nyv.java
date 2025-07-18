package defpackage;

import android.view.MotionEvent;
import android.view.View;
import com.google.common.collect.Sets;
import com.google.protos.youtube.elements.SenderStateOuterClass$SenderState;
import java.lang.ref.WeakReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nyv extends nzx {
    public final WeakReference a;
    public final View b;
    public final ofs c;
    public final yyr d;
    public final SenderStateOuterClass$SenderState e;
    public final obz f;
    public final ocj g;
    public final oal h;
    public final MotionEvent i;
    public final int j;

    public nyv(WeakReference weakReference, View view, int i, ofs ofsVar, yyr yyrVar, SenderStateOuterClass$SenderState senderStateOuterClass$SenderState, obz obzVar, ocj ocjVar, oal oalVar, MotionEvent motionEvent) {
        this.a = weakReference;
        this.b = view;
        this.j = i;
        this.c = ofsVar;
        this.d = yyrVar;
        this.e = senderStateOuterClass$SenderState;
        this.f = obzVar;
        this.g = ocjVar;
        this.h = oalVar;
        this.i = motionEvent;
    }

    @Override // defpackage.nzx
    public final MotionEvent a() {
        return this.i;
    }

    @Override // defpackage.nzx
    public final View b() {
        return this.b;
    }

    @Override // defpackage.nzx
    public final nzv c() {
        return new nyu(this);
    }

    @Override // defpackage.nzx
    public final oal d() {
        return this.h;
    }

    @Override // defpackage.nzx
    public final obz e() {
        return this.f;
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x0097  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean equals(java.lang.Object r7) {
        /*
            r6 = this;
            r0 = 1
            if (r7 != r6) goto L4
            return r0
        L4:
            boolean r1 = r7 instanceof defpackage.nzx
            r2 = 0
            if (r1 == 0) goto Le7
            nzx r7 = (defpackage.nzx) r7
            java.lang.ref.WeakReference r1 = r6.a
            if (r1 != 0) goto L16
            java.lang.ref.WeakReference r1 = r7.j()
            if (r1 != 0) goto Le7
            goto L20
        L16:
            java.lang.ref.WeakReference r3 = r7.j()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto Le7
        L20:
            android.view.View r1 = r6.b
            if (r1 != 0) goto L2b
            android.view.View r1 = r7.b()
            if (r1 != 0) goto Le7
            goto L35
        L2b:
            android.view.View r3 = r7.b()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto Le7
        L35:
            int r1 = r6.j
            if (r1 != 0) goto L40
            int r1 = r7.k()
            if (r1 != 0) goto Le7
            goto L46
        L40:
            int r3 = r7.k()
            if (r1 != r3) goto Le7
        L46:
            ofs r1 = r6.c
            if (r1 != 0) goto L51
            ofs r1 = r7.g()
            if (r1 != 0) goto Le7
            goto L5b
        L51:
            ofs r3 = r7.g()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto Le7
        L5b:
            r7.l()
            yyr r1 = r6.d
            yyr r3 = r7.h()
            boolean r1 = defpackage.zbk.e(r1, r3)
            if (r1 == 0) goto Le7
            com.google.protos.youtube.elements.SenderStateOuterClass$SenderState r1 = r6.e
            if (r1 != 0) goto L75
            com.google.protos.youtube.elements.SenderStateOuterClass$SenderState r1 = r7.i()
            if (r1 != 0) goto Le7
            goto L97
        L75:
            com.google.protos.youtube.elements.SenderStateOuterClass$SenderState r3 = r7.i()
            if (r1 == r3) goto L97
            if (r3 == 0) goto Le7
            java.lang.Class r4 = r1.getClass()
            java.lang.Class r5 = r3.getClass()
            if (r4 != r5) goto Le7
            java.lang.Class r4 = r1.getClass()
            abza r5 = defpackage.abza.a
            abzj r4 = r5.a(r4)
            boolean r1 = r4.k(r1, r3)
            if (r1 == 0) goto Le7
        L97:
            obz r1 = r6.f
            if (r1 != 0) goto La2
            obz r1 = r7.e()
            if (r1 != 0) goto Le7
            goto Lac
        La2:
            obz r3 = r7.e()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto Le7
        Lac:
            r7.m()
            ocj r1 = r6.g
            if (r1 != 0) goto Lba
            ocj r1 = r7.f()
            if (r1 != 0) goto Le7
            goto Lc4
        Lba:
            ocj r3 = r7.f()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto Le7
        Lc4:
            oal r1 = r6.h
            oal r3 = r7.d()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto Le7
            android.view.MotionEvent r1 = r6.i
            if (r1 != 0) goto Ldb
            android.view.MotionEvent r7 = r7.a()
            if (r7 != 0) goto Le7
            goto Le6
        Ldb:
            android.view.MotionEvent r7 = r7.a()
            boolean r7 = r1.equals(r7)
            if (r7 != 0) goto Le6
            goto Le7
        Le6:
            return r0
        Le7:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nyv.equals(java.lang.Object):boolean");
    }

    @Override // defpackage.nzx
    public final ocj f() {
        return this.g;
    }

    @Override // defpackage.nzx
    public final ofs g() {
        return this.c;
    }

    @Override // defpackage.nzx
    public final yyr h() {
        return this.d;
    }

    public final int hashCode() {
        int iB;
        WeakReference weakReference = this.a;
        int iHashCode = weakReference == null ? 0 : weakReference.hashCode();
        View view = this.b;
        int iHashCode2 = view == null ? 0 : view.hashCode();
        int i = iHashCode ^ 1000003;
        int i2 = this.j;
        if (i2 == 0) {
            i2 = 0;
        }
        int i3 = ((((i * 1000003) ^ iHashCode2) * 1000003) ^ i2) * 1000003;
        ofs ofsVar = this.c;
        int iHashCode3 = (((i3 ^ (ofsVar == null ? 0 : ofsVar.hashCode())) * (-721379959)) ^ Sets.a(this.d.entrySet())) * 1000003;
        SenderStateOuterClass$SenderState senderStateOuterClass$SenderState = this.e;
        if (senderStateOuterClass$SenderState == null) {
            iB = 0;
        } else if ((senderStateOuterClass$SenderState.memoizedSerializedSize & Integer.MIN_VALUE) != 0) {
            iB = abza.a.a(senderStateOuterClass$SenderState.getClass()).b(senderStateOuterClass$SenderState);
        } else {
            int iB2 = senderStateOuterClass$SenderState.memoizedHashCode;
            if (iB2 == 0) {
                iB2 = abza.a.a(senderStateOuterClass$SenderState.getClass()).b(senderStateOuterClass$SenderState);
                senderStateOuterClass$SenderState.memoizedHashCode = iB2;
            }
            iB = iB2;
        }
        int i4 = (iHashCode3 ^ iB) * 1000003;
        obz obzVar = this.f;
        int iHashCode4 = (i4 ^ (obzVar == null ? 0 : obzVar.hashCode())) * (-721379959);
        ocj ocjVar = this.g;
        int iHashCode5 = (((iHashCode4 ^ (ocjVar == null ? 0 : ocjVar.hashCode())) * 1000003) ^ this.h.hashCode()) * 1000003;
        MotionEvent motionEvent = this.i;
        return iHashCode5 ^ (motionEvent != null ? motionEvent.hashCode() : 0);
    }

    @Override // defpackage.nzx
    public final SenderStateOuterClass$SenderState i() {
        return this.e;
    }

    @Override // defpackage.nzx
    public final WeakReference j() {
        return this.a;
    }

    @Override // defpackage.nzx
    public final int k() {
        return this.j;
    }

    public final String toString() {
        return "CommandEventData{viewWeakRef=" + String.valueOf(this.a) + ", anchorView=" + String.valueOf(this.b) + ", eventType=" + ocw.a(this.j) + ", touchLocation=" + String.valueOf(this.c) + ", customData=null, customMap=" + zbk.c(this.d) + ", senderState=" + String.valueOf(this.e) + ", elementBuilder=" + String.valueOf(this.f) + ", identifier=null, elementsConfig=" + String.valueOf(this.g) + ", conversionContext=" + this.h.toString() + ", motionEvent=" + String.valueOf(this.i) + "}";
    }

    @Override // defpackage.nzx
    public final void l() {
    }

    @Override // defpackage.nzx
    public final void m() {
    }
}
