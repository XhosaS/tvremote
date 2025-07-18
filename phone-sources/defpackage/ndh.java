package defpackage;

import android.animation.TimeAnimator;
import android.util.SparseArray;
import com.google.android.tv.remote.virtual.ui.assistant.VirtualRemoteAssistantButton;
import java.util.ArrayDeque;
import java.util.Deque;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ndh implements TimeAnimator.TimeListener {
    public final TimeAnimator a;
    public final ndm b;
    public ndg d;
    public long e;
    public long f;
    public nde g;
    public int j;
    public boolean k;
    public final jys l;
    public final ArrayDeque c = new ArrayDeque();
    private final float[] m = new float[4];
    public final SparseArray h = new SparseArray();
    public int i = 0;

    public ndh(ndm ndmVar, TimeAnimator timeAnimator, ndg ndgVar, jys jysVar) {
        this.g = nde.b;
        this.b = ndmVar;
        this.a = timeAnimator;
        this.d = ndgVar;
        this.l = jysVar;
        this.g = jys.T(0);
        timeAnimator.setTimeListener(this);
    }

    public final Deque a(int i) {
        ArrayDeque arrayDeque = new ArrayDeque();
        while (i != 8) {
            arrayDeque.addFirst(Integer.valueOf(i));
            i = i != 6 ? 8 : 5;
        }
        return arrayDeque;
    }

    public final void b() {
        this.a.pause();
    }

    public final void c() {
        TimeAnimator timeAnimator = this.a;
        if (timeAnimator.isStarted()) {
            timeAnimator.resume();
        } else {
            timeAnimator.start();
        }
    }

    public final void d(nde ndeVar) {
        nde ndeVar2 = this.g;
        ndm ndmVar = this.b;
        ndeVar2.b(ndmVar);
        if (ndeVar == null) {
            this.a.end();
        } else {
            this.g = ndeVar;
            int i = this.j;
            if (i != 0 && i != this.i) {
                nde ndeVarR = jys.R(jys.U(i));
                nde ndeVarT = jys.T(this.j);
                nde ndeVar3 = this.g;
                if (ndeVar3 == ndeVarR || ndeVar3 == ndeVarT) {
                    this.a.isStarted();
                    int i2 = this.j;
                    this.i = i2;
                    this.j = 0;
                    nca ncaVar = (nca) this.h.get(i2);
                    if (ncaVar != null) {
                        ncaVar.a();
                    }
                }
            }
            this.g.a(ndmVar);
            this.f = this.e;
        }
        ndg ndgVar = this.d;
        if (ndgVar != null) {
            ndgVar.b();
        }
    }

    public final void e() {
        this.k = true;
        TimeAnimator timeAnimator = this.a;
        if (timeAnimator.isStarted()) {
            return;
        }
        this.e = 0L;
        timeAnimator.start();
    }

    @Override // android.animation.TimeAnimator.TimeListener
    public final void onTimeUpdate(TimeAnimator timeAnimator, long j, long j2) {
        int i = 0;
        if (this.k) {
            this.k = false;
            d((nde) this.c.pollFirst());
        }
        if (this.a.isStarted()) {
            this.e = j;
            nca ncaVar = (nca) this.h.get(this.i);
            if (ncaVar != null) {
                float[] fArr = this.m;
                if (ncaVar.e != null) {
                    float[] fArr2 = ncaVar.a;
                    fArr2[ncaVar.d] = ((VirtualRemoteAssistantButton) r10.a).c / 100.0f;
                    int i2 = ncaVar.d;
                    float f = ((fArr2[i2] + fArr2[(i2 + 3) & 3]) + fArr2[(i2 + 2) & 3]) / 3.0f;
                    float f2 = ncaVar.c;
                    int i3 = nbz.a;
                    float f3 = f > f2 ? f2 + ((f - f2) * 0.3f) : f2 * 0.92f;
                    ncaVar.c = f3;
                    fArr[0] = f3;
                    float[] fArr3 = ncaVar.b;
                    int i4 = ncaVar.d;
                    fArr[1] = fArr3[(i4 + 3) & 3];
                    fArr[2] = fArr3[(i4 + 2) & 3];
                    fArr[3] = fArr3[(i4 + 1) & 3];
                }
                float[] fArr4 = ncaVar.b;
                int i5 = ncaVar.d;
                fArr4[i5] = ncaVar.c;
                ncaVar.d = (i5 + 1) & 3;
                ndm ndmVar = this.b;
                while (i < 4 && i < ndmVar.a.size()) {
                    (i != 0 ? i != 1 ? i != 2 ? ndmVar.i ? ndmVar.f : ndmVar.e : ndmVar.d : ndmVar.c : ndmVar.b).m = fArr[i];
                    i++;
                }
            }
            boolean zC = this.g.c(this.f, this.e, this.b);
            ndg ndgVar = this.d;
            if (ndgVar != null) {
                ndgVar.b();
            }
            if (zC) {
                return;
            }
            e();
        }
    }
}
