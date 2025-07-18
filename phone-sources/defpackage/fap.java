package defpackage;

import android.os.SystemClock;
import java.util.Deque;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class fap implements far {
    public final /* synthetic */ long a;
    private final /* synthetic */ int b;

    public /* synthetic */ fap(long j, int i) {
        this.b = i;
        this.a = j;
    }

    @Override // defpackage.far
    public final boolean a(Deque deque) {
        if (this.b == 0) {
            return ((long) deque.size()) >= this.a;
        }
        if (!deque.isEmpty()) {
            long j = this.a;
            faq faqVar = (faq) deque.peek();
            String str = edt.a;
            if (faqVar.c + j < SystemClock.elapsedRealtime()) {
                return true;
            }
        }
        return false;
    }
}
