package defpackage;

import android.util.StateSet;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bku {
    final int a;
    public final bkh b;
    final int[][] c;
    final bkh[] d;

    public bku(bkt bktVar) {
        this.a = bktVar.a;
        this.b = bktVar.b;
        this.c = bktVar.c;
        this.d = bktVar.d;
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
