package defpackage;

import android.util.StateSet;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class vck {
    final int a;
    public final vbw b;
    final int[][] c;
    final vbw[] d;

    public vck(vcj vcjVar) {
        this.a = vcjVar.a;
        this.b = vcjVar.b;
        this.c = vcjVar.c;
        this.d = vcjVar.d;
    }

    public final int a(int[] iArr) {
        for (int i = 0; i < this.a; i++) {
            if (StateSet.stateSetMatches(this.c[i], iArr)) {
                return i;
            }
        }
        return -1;
    }
}
