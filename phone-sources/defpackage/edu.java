package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class edu implements eac {
    public final String a;
    public final byte[] b;
    public final int c;
    public final int d;

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public edu(java.lang.String r5, byte[] r6, int r7, int r8) {
        /*
            r4 = this;
            r4.<init>()
            int r0 = r5.hashCode()
            r1 = 1
            r2 = 0
            switch(r0) {
                case -1949883051: goto L5e;
                case -269399509: goto L41;
                case 1011693540: goto L28;
                case 1098277265: goto L1f;
                case 2002123038: goto Le;
                default: goto Lc;
            }
        Lc:
            goto L75
        Le:
            java.lang.String r0 = "auxiliary.tracks.map"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L75
            if (r8 != 0) goto L19
            goto L1a
        L19:
            r1 = r2
        L1a:
            defpackage.a.H(r1)
            goto L75
        L1f:
            java.lang.String r0 = "auxiliary.tracks.offset"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L75
            goto L30
        L28:
            java.lang.String r0 = "auxiliary.tracks.length"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L75
        L30:
            r0 = 78
            if (r8 != r0) goto L3c
            int r8 = r6.length
            r3 = 8
            if (r8 != r3) goto L3b
            r8 = r0
            goto L3d
        L3b:
            r8 = r0
        L3c:
            r1 = r2
        L3d:
            defpackage.a.H(r1)
            goto L75
        L41:
            java.lang.String r0 = "auxiliary.tracks.interleaved"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L75
            r0 = 75
            if (r8 != r0) goto L59
            int r8 = r6.length
            if (r8 != r1) goto L58
            r8 = r6[r2]
            if (r8 == 0) goto L56
            if (r8 != r1) goto L58
        L56:
            r8 = r0
            goto L5a
        L58:
            r8 = r0
        L59:
            r1 = r2
        L5a:
            defpackage.a.H(r1)
            goto L75
        L5e:
            java.lang.String r0 = "com.android.capture.fps"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L75
            r0 = 23
            if (r8 != r0) goto L71
            int r8 = r6.length
            r3 = 4
            if (r8 != r3) goto L70
            r8 = r0
            goto L72
        L70:
            r8 = r0
        L71:
            r1 = r2
        L72:
            defpackage.a.H(r1)
        L75:
            r4.a = r5
            r4.b = r6
            r4.c = r7
            r4.d = r8
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.edu.<init>(java.lang.String, byte[], int, int):void");
    }

    @Override // defpackage.eac
    public final /* synthetic */ dze a() {
        return null;
    }

    @Override // defpackage.eac
    public final /* synthetic */ byte[] c() {
        return null;
    }

    public final List d() {
        eci.b(this.a.equals("auxiliary.tracks.map"), "Metadata is not an auxiliary tracks map");
        byte[] bArr = this.b;
        byte b = bArr[1];
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < b; i++) {
            arrayList.add(Integer.valueOf(bArr[i + 2]));
        }
        return arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            edu eduVar = (edu) obj;
            if (this.a.equals(eduVar.a) && Arrays.equals(this.b, eduVar.b) && this.c == eduVar.c && this.d == eduVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.a.hashCode() + 527) * 31) + Arrays.hashCode(this.b)) * 31) + this.c) * 31) + this.d;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x007e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String toString() throws java.io.IOException {
        /*
            r5 = this;
            int r0 = r5.d
            r1 = 0
            if (r0 == 0) goto L57
            r2 = 1
            if (r0 == r2) goto L50
            r2 = 23
            if (r0 == r2) goto L41
            r2 = 67
            if (r0 == r2) goto L36
            r2 = 75
            if (r0 == r2) goto L2a
            r2 = 78
            if (r0 == r2) goto L19
            goto L7e
        L19:
            byte[] r0 = r5.b
            edi r1 = new edi
            r1.<init>(r0)
            long r0 = r1.s()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            goto Lad
        L2a:
            byte[] r0 = r5.b
            r0 = r0[r1]
            r0 = r0 & 255(0xff, float:3.57E-43)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            goto Lad
        L36:
            byte[] r0 = r5.b
            int r0 = defpackage.sfy.Y(r0)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            goto Lad
        L41:
            byte[] r0 = r5.b
            int r0 = defpackage.sfy.Y(r0)
            float r0 = java.lang.Float.intBitsToFloat(r0)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            goto Lad
        L50:
            byte[] r0 = r5.b
            java.lang.String r0 = defpackage.edt.S(r0)
            goto Lad
        L57:
            java.lang.String r0 = r5.a
            java.lang.String r2 = "auxiliary.tracks.map"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L7e
            java.util.List r0 = r5.d()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "track types = "
            r1.append(r2)
            tsp r2 = new tsp
            java.lang.String r3 = ","
            r2.<init>(r3)
            r2.e(r1, r0)
            java.lang.String r0 = r1.toString()
            goto Lad
        L7e:
            byte[] r0 = r5.b
            java.lang.String r2 = defpackage.edt.a
            int r2 = r0.length
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            int r2 = r2 + r2
            r3.<init>(r2)
        L89:
            int r2 = r0.length
            if (r1 >= r2) goto La9
            r2 = r0[r1]
            int r2 = r2 >> 4
            r2 = r2 & 15
            r4 = 16
            char r2 = java.lang.Character.forDigit(r2, r4)
            r3.append(r2)
            r2 = r0[r1]
            r2 = r2 & 15
            char r2 = java.lang.Character.forDigit(r2, r4)
            r3.append(r2)
            int r1 = r1 + 1
            goto L89
        La9:
            java.lang.String r0 = r3.toString()
        Lad:
            java.lang.String r1 = r5.a
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "mdta: key="
            r2.<init>(r3)
            r2.append(r1)
            java.lang.String r1 = ", value="
            r2.append(r1)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.edu.toString():java.lang.String");
    }

    @Override // defpackage.eac
    public final /* synthetic */ void b(eaa eaaVar) {
    }
}
