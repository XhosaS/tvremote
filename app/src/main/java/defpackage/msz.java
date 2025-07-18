package defpackage;

import com.google.protos.youtube.elements.CommandOuterClass$Command;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class msz implements oaa {
    final mwc a;
    final mvv b;
    private final mtb c;
    private final mva d;

    public msz(mwc mwcVar, mvv mvvVar, mtb mtbVar, mva mvaVar) {
        this.a = mwcVar;
        this.b = mvvVar;
        this.c = mtbVar;
        Boolean bool = false;
        bool.getClass();
        this.d = mvaVar;
    }

    @Override // defpackage.oaa
    public final /* synthetic */ agff a(CommandOuterClass$Command commandOuterClass$Command, nzx nzxVar) {
        return b(commandOuterClass$Command, nzxVar, 2);
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x000f  */
    @Override // defpackage.oaa
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.agff b(final com.google.protos.youtube.elements.CommandOuterClass$Command r9, final defpackage.nzx r10, int r11) {
        /*
            r8 = this;
            if (r10 != 0) goto La
            nzv r10 = defpackage.nzx.p()
            nzx r10 = r10.e()
        La:
            mvv r0 = r8.b
            r1 = 0
            if (r0 != 0) goto L12
        Lf:
            r4 = r9
            goto L85
        L12:
            abxc r2 = defpackage.acyo.b
            com.google.protobuf.MessageLite r3 = r2.a
            com.google.protos.youtube.elements.CommandOuterClass$Command r4 = com.google.protos.youtube.elements.CommandOuterClass$Command.a
            java.lang.String r5 = "This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings."
            if (r3 != r4) goto La0
            abwr r3 = r9.n
            abxb r2 = r2.d
            boolean r2 = r3.n(r2)
            if (r2 != 0) goto L69
            abxc r2 = defpackage.aczd.b
            com.google.protobuf.MessageLite r3 = r2.a
            if (r3 != r4) goto L63
            abwr r3 = r9.n
            abxb r2 = r2.d
            boolean r2 = r3.n(r2)
            if (r2 != 0) goto L69
            abxc r2 = defpackage.acza.b
            com.google.protobuf.MessageLite r3 = r2.a
            if (r3 != r4) goto L5d
            abwr r3 = r9.n
            abxb r2 = r2.d
            boolean r2 = r3.n(r2)
            if (r2 != 0) goto L69
            abxc r2 = defpackage.acsu.b
            com.google.protobuf.MessageLite r3 = r2.a
            if (r3 != r4) goto L57
            abwr r3 = r9.n
            abxb r2 = r2.d
            boolean r2 = r3.n(r2)
            if (r2 == 0) goto Lf
            goto L69
        L57:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            r9.<init>(r5)
            throw r9
        L5d:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            r9.<init>(r5)
            throw r9
        L63:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            r9.<init>(r5)
            throw r9
        L69:
            msx r1 = new msx
            r1.<init>()
            agff r3 = defpackage.agff.c(r1)
            mwc r0 = r8.a
            mva r2 = r8.d
            r1 = r10
            nyv r1 = (defpackage.nyv) r1
            com.google.protos.youtube.elements.SenderStateOuterClass$SenderState r5 = r1.e
            r0.b()
            r6 = 0
            r7 = 0
            r4 = r9
            agff r1 = r2.a(r3, r4, r5, r6, r7)
        L85:
            if (r1 != 0) goto L8d
            mwc r9 = r8.a
            agff r1 = r9.a(r4, r10)
        L8d:
            r9 = 2
            if (r11 != r9) goto L9f
            mtb r9 = r8.c
            nyv r10 = (defpackage.nyv) r10
            oal r10 = r10.h
            mtb r9 = r9.a(r10)
            agff r9 = r1.b(r9)
            return r9
        L9f:
            return r1
        La0:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            r9.<init>(r5)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.msz.b(com.google.protos.youtube.elements.CommandOuterClass$Command, nzx, int):agff");
    }

    @Override // defpackage.oaa
    public final /* synthetic */ agff c(CommandOuterClass$Command commandOuterClass$Command, nzx nzxVar) {
        return b(commandOuterClass$Command, nzxVar, 1);
    }
}
