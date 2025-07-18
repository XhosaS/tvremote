package defpackage;

import java.util.Arrays;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class tqs {
    public final int[] a;
    public final tqq b;
    public tqq c;
    public int d;
    public int e;
    public int f;

    public tqs(int[] iArr) {
        this.a = iArr;
        tqq tqqVar = new tqq(-1, -1);
        this.b = tqqVar;
        this.c = tqqVar;
    }

    private final void d(tqq tqqVar, StringBuilder sb) {
        for (tqq tqqVar2 : tqqVar.d.values()) {
            sb.append("  ");
            sb.append(tqqVar);
            sb.append(" -> ");
            sb.append(tqqVar2);
            sb.append(" [label=\"");
            int[] iArr = this.a;
            sb.append(Arrays.toString(Arrays.copyOfRange(iArr, tqqVar2.a, Math.min(iArr.length, tqqVar2.b + 1))));
            sb.append("\"]\n");
            d(tqqVar2, sb);
        }
    }

    final void a() {
        tqq tqqVar = this.c.c;
        if (tqqVar != null) {
            this.c = tqqVar;
        } else {
            this.c = this.b;
            int i = this.e;
            if (i > 0) {
                this.e = i - 1;
            }
            if (this.f > 0) {
                this.d++;
            }
        }
        b();
    }

    final void b() {
        if (this.e == 0) {
            return;
        }
        Map map = this.c.d;
        int[] iArr = this.a;
        tqq tqqVar = (tqq) map.get(Integer.valueOf(iArr[this.d]));
        while (true) {
            int i = (tqqVar.b - tqqVar.a) + 1;
            int i2 = this.e;
            if (i > i2) {
                return;
            }
            int i3 = this.d + i;
            this.d = i3;
            this.c = tqqVar;
            int i4 = i2 - i;
            this.e = i4;
            if (i4 > 0) {
                tqqVar = (tqq) tqqVar.d.get(Integer.valueOf(iArr[i3]));
            }
        }
    }

    public final boolean c(int i, int i2, int i3, int i4) {
        if (i >= 0 && i3 >= 0) {
            int[] iArr = this.a;
            int length = iArr.length;
            int iMin = Math.min(length, i2);
            if (iMin - i == Math.min(length, i4) - i3) {
                for (int i5 = i; i5 <= iMin; i5++) {
                    if (iArr[i5] != iArr[(i3 + i5) - i]) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("digraph {\n");
        d(this.b, sb);
        sb.append("}");
        return sb.toString();
    }
}
