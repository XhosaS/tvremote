package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Pair;
import com.google.android.apps.play.movies.common.view.subtitles.Subtitles;
import com.google.android.apps.play.movies.common.view.subtitles.SubtitlesOverlay;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lmk extends ejw implements Handler.Callback, llk {
    private Subtitles c;
    private SubtitlesOverlay d;
    private boolean e;
    private long i;
    public boolean a = false;
    private final Handler b = new Handler(Looper.getMainLooper(), this);
    private int f = 0;
    private long g = -9223372036854775807L;
    private long h = -9223372036854775807L;

    private static long v(Subtitles subtitles, int i) {
        if (i == subtitles.getEventTimes().size()) {
            return -9223372036854775807L;
        }
        return r1.get(i).intValue();
    }

    private final void w() {
        this.h = -9223372036854775807L;
        SubtitlesOverlay subtitlesOverlay = this.d;
        if (subtitlesOverlay != null) {
            this.b.obtainMessage(0, Pair.create(subtitlesOverlay, null)).sendToTarget();
        }
    }

    private final void x(long j) {
        this.h = j;
        if (this.d != null) {
            this.b.obtainMessage(1, Pair.create(this.d, this.c.getSubtitleWindowSnapshotsAt((int) j))).sendToTarget();
        }
    }

    private final void y(long j) {
        if (this.c == null) {
            this.f = 0;
            this.g = -9223372036854775807L;
            w();
        } else {
            long jF = edt.F(j);
            int iBinarySearch = Collections.binarySearch(this.c.getEventTimes(), Integer.valueOf((int) jF));
            int i = iBinarySearch >= 0 ? iBinarySearch + 1 : ~iBinarySearch;
            this.f = i;
            this.g = v(this.c, i);
            x(jF);
        }
        this.e = false;
    }

    @Override // defpackage.ekc, defpackage.eke
    public final String U() {
        return "SubtitleRenderer";
    }

    @Override // defpackage.ekc
    public final void V(long j, long j2) {
        if (this.a) {
            return;
        }
        long j3 = j - this.i;
        if (this.e) {
            y(j3);
            return;
        }
        long jF = edt.F(j3);
        boolean z = false;
        while (true) {
            long j4 = this.g;
            if (j4 == -9223372036854775807L || j4 > jF) {
                break;
            }
            Subtitles subtitles = this.c;
            int i = this.f + 1;
            this.f = i;
            this.g = v(subtitles, i);
            z = true;
        }
        if (z) {
            x(jF);
        }
    }

    @Override // defpackage.ejw
    protected final synchronized void g() {
        w();
    }

    @Override // defpackage.ejw
    protected final void h(long j) {
        this.i = j;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        Pair pair = (Pair) message.obj;
        int i = message.what;
        if (i == 0) {
            ((SubtitlesOverlay) pair.first).clear();
            return true;
        }
        if (i != 1) {
            return false;
        }
        ((SubtitlesOverlay) pair.first).update((List) pair.second);
        return true;
    }

    @Override // defpackage.ejw
    protected final void m(long j) {
        if (this.a) {
            return;
        }
        y(j - this.i);
    }

    @Override // defpackage.ejw, defpackage.ejz
    public final void s(int i, Object obj) {
        Subtitles subtitles;
        if (i != 10000) {
            if (i != 10001 || this.c == (subtitles = (Subtitles) obj)) {
                return;
            }
            this.c = subtitles;
            this.e = true;
            return;
        }
        this.d = (SubtitlesOverlay) obj;
        long j = this.h;
        if (j == -9223372036854775807L) {
            w();
        } else if (this.c != null) {
            x(j);
        }
    }
}
