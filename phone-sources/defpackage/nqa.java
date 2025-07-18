package defpackage;

import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class nqa implements nsm {
    final /* synthetic */ BasePendingResult a;
    private final /* synthetic */ int b;

    public nqa(BasePendingResult basePendingResult, int i) {
        this.b = i;
        this.a = basePendingResult;
    }

    @Override // defpackage.nsm
    public final void a(String str, long j, int i, Object obj, long j2, long j3) {
        if (this.b != 0) {
            try {
                this.a.q(new nlz(new Status(i)));
                return;
            } catch (IllegalStateException e) {
                Log.e("RemoteMediaPlayer", "Result already set when calling onRequestCompleted", e);
                return;
            }
        }
        try {
            BasePendingResult basePendingResult = this.a;
            Status status = new Status(i);
            if (true != (obj instanceof nsj)) {
                obj = null;
            }
            basePendingResult.q(new nqe(status, obj != null ? ((nsj) obj).a : null));
        } catch (IllegalStateException e2) {
            nqj.a.c(e2, "Result already set when calling onRequestCompleted", new Object[0]);
        }
        Iterator it = ((nqc) this.a).d.f.iterator();
        while (it.hasNext()) {
            ((npj) it.next()).c(str, j, i, j2, j3);
        }
    }

    @Override // defpackage.nsm
    public final void b(String str, long j, long j2, long j3) {
        if (this.b != 0) {
            try {
                this.a.q(new nlw(new Status(2103)));
                return;
            } catch (IllegalStateException e) {
                Log.e("RemoteMediaPlayer", "Result already set when calling onRequestReplaced", e);
                return;
            }
        }
        try {
            this.a.q(new nqb(new Status(2103), 0));
        } catch (IllegalStateException e2) {
            nqj.a.c(e2, "Result already set when calling onRequestReplaced", new Object[0]);
        }
        Iterator it = ((nqc) this.a).d.f.iterator();
        while (it.hasNext()) {
            ((npj) it.next()).c(str, j, 2103, j2, j3);
        }
    }
}
