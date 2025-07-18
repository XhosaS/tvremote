package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class twt extends txo {
    public final String a;
    public final tuw b;
    public final tso c;
    public final boolean d;
    public final Boolean e;
    public final trb f;
    public final int g;
    public final Uri h;

    public twt(String str, tuw tuwVar, tso tsoVar, boolean z, Boolean bool, trb trbVar, int i, Uri uri) {
        this.a = str;
        this.b = tuwVar;
        this.c = tsoVar;
        this.d = z;
        this.e = bool;
        this.f = trbVar;
        this.g = i;
        this.h = uri;
    }

    @Override // defpackage.txo
    public final int a() {
        return this.g;
    }

    @Override // defpackage.txo
    public final Uri b() {
        return this.h;
    }

    @Override // defpackage.txo
    public final trb c() {
        return this.f;
    }

    @Override // defpackage.txo
    public final tso d() {
        return this.c;
    }

    @Override // defpackage.txo
    public final tuw e() {
        return this.b;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x007a  */
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
            boolean r1 = r7 instanceof defpackage.txo
            r2 = 0
            if (r1 == 0) goto Lce
            txo r7 = (defpackage.txo) r7
            java.lang.String r1 = r6.a
            if (r1 != 0) goto L16
            java.lang.String r1 = r7.h()
            if (r1 != 0) goto Lce
            goto L20
        L16:
            java.lang.String r3 = r7.h()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto Lce
        L20:
            tuw r1 = r6.b
            if (r1 != 0) goto L2b
            tuw r1 = r7.e()
            if (r1 != 0) goto Lce
            goto L4d
        L2b:
            tuw r3 = r7.e()
            if (r1 == r3) goto L4d
            if (r3 == 0) goto Lce
            java.lang.Class r4 = r1.getClass()
            java.lang.Class r5 = r3.getClass()
            if (r4 != r5) goto Lce
            java.lang.Class r4 = r1.getClass()
            abza r5 = defpackage.abza.a
            abzj r4 = r5.a(r4)
            boolean r1 = r4.k(r1, r3)
            if (r1 == 0) goto Lce
        L4d:
            tso r1 = r6.c
            if (r1 != 0) goto L58
            tso r1 = r7.d()
            if (r1 != 0) goto Lce
            goto L7a
        L58:
            tso r3 = r7.d()
            if (r1 == r3) goto L7a
            if (r3 == 0) goto Lce
            java.lang.Class r4 = r1.getClass()
            java.lang.Class r5 = r3.getClass()
            if (r4 != r5) goto Lce
            java.lang.Class r4 = r1.getClass()
            abza r5 = defpackage.abza.a
            abzj r4 = r5.a(r4)
            boolean r1 = r4.k(r1, r3)
            if (r1 == 0) goto Lce
        L7a:
            boolean r1 = r6.d
            boolean r3 = r7.i()
            if (r1 != r3) goto Lce
            java.lang.Boolean r1 = r6.e
            if (r1 != 0) goto L8d
            java.lang.Boolean r1 = r7.g()
            if (r1 != 0) goto Lce
            goto L97
        L8d:
            java.lang.Boolean r3 = r7.g()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto Lce
        L97:
            trb r1 = r6.f
            if (r1 != 0) goto La2
            trb r1 = r7.c()
            if (r1 != 0) goto Lce
            goto Lac
        La2:
            trb r3 = r7.c()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto Lce
        Lac:
            int r1 = r6.g
            int r3 = r7.a()
            if (r1 != r3) goto Lce
            android.net.Uri r1 = r6.h
            if (r1 != 0) goto Lbf
            android.net.Uri r1 = r7.b()
            if (r1 != 0) goto Lce
            goto Lca
        Lbf:
            android.net.Uri r3 = r7.b()
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto Lca
            goto Lce
        Lca:
            r7.j()
            return r0
        Lce:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.twt.equals(java.lang.Object):boolean");
    }

    @Override // defpackage.txo
    public final txn f() {
        return new tws(this);
    }

    @Override // defpackage.txo
    public final Boolean g() {
        return this.e;
    }

    @Override // defpackage.txo
    public final String h() {
        return this.a;
    }

    public final int hashCode() {
        int iB;
        int iB2;
        String str = this.a;
        int iHashCode = str == null ? 0 : str.hashCode();
        tuw tuwVar = this.b;
        if (tuwVar == null) {
            iB = 0;
        } else if ((tuwVar.memoizedSerializedSize & Integer.MIN_VALUE) != 0) {
            iB = abza.a.a(tuwVar.getClass()).b(tuwVar);
        } else {
            int iB3 = tuwVar.memoizedHashCode;
            if (iB3 == 0) {
                iB3 = abza.a.a(tuwVar.getClass()).b(tuwVar);
                tuwVar.memoizedHashCode = iB3;
            }
            iB = iB3;
        }
        int i = iHashCode ^ 1000003;
        tso tsoVar = this.c;
        if (tsoVar == null) {
            iB2 = 0;
        } else if ((Integer.MIN_VALUE & tsoVar.memoizedSerializedSize) != 0) {
            iB2 = abza.a.a(tsoVar.getClass()).b(tsoVar);
        } else {
            iB2 = tsoVar.memoizedHashCode;
            if (iB2 == 0) {
                iB2 = abza.a.a(tsoVar.getClass()).b(tsoVar);
                tsoVar.memoizedHashCode = iB2;
            }
        }
        int i2 = ((((((i * 1000003) ^ iB) * 1000003) ^ iB2) * 1000003) ^ (true != this.d ? 1237 : 1231)) * 1000003;
        Boolean bool = this.e;
        int iHashCode2 = (i2 ^ (bool == null ? 0 : bool.hashCode())) * 1000003;
        trb trbVar = this.f;
        int iHashCode3 = (((iHashCode2 ^ (trbVar == null ? 0 : trbVar.hashCode())) * 1000003) ^ this.g) * 1000003;
        Uri uri = this.h;
        return ((iHashCode3 ^ (uri != null ? uri.hashCode() : 0)) * 1000003) ^ 1237;
    }

    @Override // defpackage.txo
    public final boolean i() {
        return this.d;
    }

    public final String toString() {
        Uri uri = this.h;
        trb trbVar = this.f;
        tso tsoVar = this.c;
        return "TranscriptionState{language=" + this.a + ", liveTranscription=" + String.valueOf(this.b) + ", finalRecognitionResults=" + String.valueOf(tsoVar) + ", hasStartOfSpeech=" + this.d + ", isMicOpen=" + this.e + ", appflowErrorStatus=" + String.valueOf(trbVar) + ", speechLevel=" + this.g + ", audioUri=" + String.valueOf(uri) + ", lastAudioRationaleToastTimestampLoaded=false}";
    }

    @Override // defpackage.txo
    public final void j() {
    }
}
