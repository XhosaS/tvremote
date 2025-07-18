package defpackage;

import android.media.AudioDeviceInfo;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class sfu extends agtu implements agvb {
    final /* synthetic */ AudioDeviceInfo[] a;
    final /* synthetic */ sge b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sfu(AudioDeviceInfo[] audioDeviceInfoArr, sge sgeVar, agsw agswVar) {
        super(2, agswVar);
        this.a = audioDeviceInfoArr;
        this.b = sgeVar;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((sfu) c((ahbt) obj, (agsw) obj2)).b(agpu.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x004f  */
    @Override // defpackage.agto
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(java.lang.Object r17) {
        /*
            r16 = this;
            r0 = r16
            defpackage.agpl.b(r17)
            android.media.AudioDeviceInfo[] r1 = r0.a
            java.util.ArrayList r2 = new java.util.ArrayList
            int r3 = r1.length
            r2.<init>(r3)
            r5 = 0
        Le:
            sge r6 = r0.b
            if (r5 >= r3) goto Ld4
            r7 = r1[r5]
            java.util.List r8 = r6.f
            boolean r9 = r8 instanceof java.util.Collection
            if (r9 == 0) goto L23
            boolean r9 = r8.isEmpty()
            if (r9 == 0) goto L23
        L20:
            r9 = 0
            goto Lc9
        L23:
            java.util.Iterator r8 = r8.iterator()
        L27:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L20
            java.lang.Object r9 = r8.next()
            sfg r9 = (defpackage.sfg) r9
            int r9 = r9.b
            int r10 = r7.getId()
            if (r9 != r10) goto L27
            java.util.List r8 = r6.f
            java.lang.Object r8 = defpackage.agqq.o(r8)
            sfg r8 = (defpackage.sfg) r8
            if (r8 == 0) goto L4f
            int r10 = r7.getId()
            int r8 = r8.b
            if (r8 != r10) goto L4f
            r8 = 1
            goto L50
        L4f:
            r8 = 0
        L50:
            java.util.List r10 = r6.f
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            java.util.Iterator r10 = r10.iterator()
        L5b:
            boolean r12 = r10.hasNext()
            if (r12 == 0) goto L74
            java.lang.Object r12 = r10.next()
            r13 = r12
            sfg r13 = (defpackage.sfg) r13
            int r13 = r13.b
            int r14 = r7.getId()
            if (r13 == r14) goto L5b
            r11.add(r12)
            goto L5b
        L74:
            r6.f = r11
            zdy r10 = defpackage.sge.a
            zeo r11 = r10.b()
            zer r12 = defpackage.zfi.a
            java.lang.String r13 = "ALT.BtDevicesMgr"
            zeo r11 = r11.o(r12, r13)
            r14 = 497(0x1f1, float:6.96E-43)
            java.lang.String r15 = "com/google/android/libraries/search/audio/bluetooth/impl/BluetoothDeviceManager"
            java.lang.String r4 = "maybeRemoveInputDevice"
            java.lang.String r9 = "BluetoothDeviceManager.kt"
            zeo r11 = r11.q(r15, r4, r14, r9)
            zdv r11 = (defpackage.zdv) r11
            java.lang.String r7 = defpackage.sfh.b(r7)
            java.lang.String r14 = "#audio# BT-device(%s) is disconnected"
            r11.x(r14, r7)
            if (r8 == 0) goto Lc8
            java.util.List r7 = r6.f
            boolean r7 = r7.isEmpty()
            if (r7 != 0) goto Lc8
            zeo r7 = r10.b()
            zeo r7 = r7.o(r12, r13)
            r8 = 501(0x1f5, float:7.02E-43)
            zeo r4 = r7.q(r15, r4, r8, r9)
            zdv r4 = (defpackage.zdv) r4
            java.util.List r6 = r6.f
            java.lang.Object r6 = defpackage.agqq.o(r6)
            sfg r6 = (defpackage.sfg) r6
            if (r6 == 0) goto Lc2
            java.lang.String r6 = r6.a
            goto Lc3
        Lc2:
            r6 = 0
        Lc3:
            java.lang.String r7 = "#audio# BT-device(%s) is now recent"
            r4.x(r7, r6)
        Lc8:
            r9 = 1
        Lc9:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r9)
            r2.add(r4)
            int r5 = r5 + 1
            goto Le
        Ld4:
            boolean r1 = r2.isEmpty()
            if (r1 == 0) goto Ldb
            goto Lf4
        Ldb:
            java.util.Iterator r1 = r2.iterator()
        Ldf:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto Lf4
            java.lang.Object r2 = r1.next()
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto Ldf
            r6.a()
        Lf4:
            agpu r1 = defpackage.agpu.a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sfu.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        return new sfu(this.a, this.b, agswVar);
    }
}
