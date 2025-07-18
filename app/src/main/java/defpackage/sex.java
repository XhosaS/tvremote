package defpackage;

import android.media.AudioRecord;
import android.media.AudioTimestamp;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sex implements sdt {
    private final AudioRecord a;
    private final boolean b;
    private final ruo c;
    private final boolean d;
    private final sli e;
    private final slg f;

    /* JADX WARN: Removed duplicated region for block: B:12:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0035 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public sex(android.media.AudioRecord r3, defpackage.sec r4, defpackage.yqt r5, defpackage.sdw r6, defpackage.slh r7, boolean r8) {
        /*
            r2 = this;
            r2.<init>()
            r2.a = r3
            r2.b = r8
            ruo r4 = r4.e
            if (r4 != 0) goto Ld
            ruo r4 = defpackage.ruo.a
        Ld:
            r4.getClass()
            r2.c = r4
            int r0 = r4.b
            r0 = r0 & 256(0x100, float:3.59E-43)
            r1 = 0
            if (r0 == 0) goto L29
            int r6 = r6.ordinal()
            switch(r6) {
                case 0: goto L29;
                case 1: goto L28;
                case 2: goto L29;
                case 3: goto L29;
                case 4: goto L26;
                case 5: goto L29;
                case 6: goto L29;
                case 7: goto L29;
                case 8: goto L29;
                case 9: goto L29;
                case 10: goto L29;
                case 11: goto L29;
                case 12: goto L28;
                case 13: goto L28;
                case 14: goto L29;
                case 15: goto L29;
                default: goto L20;
            }
        L20:
            agpg r3 = new agpg
            r3.<init>()
            throw r3
        L26:
            if (r8 == 0) goto L29
        L28:
            r1 = 1
        L29:
            r2.d = r1
            java.lang.Object r5 = r5.f()
            sli r5 = (defpackage.sli) r5
            r2.e = r5
            if (r5 != 0) goto L3a
            if (r1 == 0) goto L38
            goto L3a
        L38:
            r3 = 0
            goto L4b
        L3a:
            slg r5 = new slg
            agow r6 = r7.a
            java.lang.Object r6 = r6.a()
            mcw r6 = (defpackage.mcw) r6
            r6.getClass()
            r5.<init>(r6, r3, r4)
            r3 = r5
        L4b:
            r2.f = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sex.<init>(android.media.AudioRecord, sec, yqt, sdw, slh, boolean):void");
    }

    @Override // defpackage.sdt
    public final synchronized sdx a(byte[] bArr, int i) {
        sle sleVarA;
        AudioTimestamp audioTimestamp;
        int i2 = this.a.read(bArr, 0, i);
        if (i2 < -1) {
            return new sdx(i2, 0L, 6, null);
        }
        slg slgVar = this.f;
        if (slgVar != null) {
            sleVarA = slgVar.a(i2);
            sli sliVar = this.e;
            if (sliVar != null && (audioTimestamp = sleVarA.b) != null) {
                rth rthVar = rth.a;
                rsz rszVar = new rsz();
                rtf rtfVar = rtf.a;
                rte rteVar = new rte();
                long j = audioTimestamp.nanoTime;
                if ((rteVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                    rteVar.y();
                }
                rtf rtfVar2 = (rtf) rteVar.b;
                rtfVar2.b |= 1;
                rtfVar2.c = j;
                long j2 = audioTimestamp.framePosition;
                if ((rteVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                    rteVar.y();
                }
                rtf rtfVar3 = (rtf) rteVar.b;
                rtfVar3.b |= 2;
                rtfVar3.d = j2;
                ryw.b(2, rteVar);
                rtf rtfVarA = ryw.a(rteVar);
                if ((rszVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                    rszVar.y();
                }
                rth rthVar2 = (rth) rszVar.b;
                rthVar2.c = rtfVarA;
                rthVar2.b = 1;
                sliVar.a(ryu.a(rszVar));
            }
        } else {
            sleVarA = null;
        }
        return (sleVarA == null || !this.d) ? new sdx(i2, 0L, 6, null) : new sdx(i2, sleVarA.a, 4, null);
    }

    @Override // defpackage.sdt, java.io.FileInputStream, java.io.InputStream
    public final synchronized int read(byte[] bArr, int i, int i2) {
        throw null;
    }
}
