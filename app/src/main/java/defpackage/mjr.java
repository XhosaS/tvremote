package defpackage;

import android.animation.ValueAnimator;
import android.os.Looper;
import com.google.android.libraries.elements.interfaces.DirectUpdateDataRelay;
import com.google.protos.youtube.elements.CommandOuterClass$Command;
import com.google.protos.youtube.elements.SenderStateOuterClass$SenderState;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes.dex */
class mjr {
    public final aczr a;
    public final aehf b;
    public final aehf c;
    private final ValueAnimator d;

    public mjr(aczr aczrVar, aehf aehfVar, aehf aehfVar2) {
        this.a = aczrVar;
        this.b = aehfVar;
        this.c = aehfVar2;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.d = valueAnimatorOfFloat;
        float f = aczrVar.g;
        if (f > 0.0f) {
            valueAnimatorOfFloat.setDuration((long) f);
        } else {
            valueAnimatorOfFloat.setDuration(1000L);
            valueAnimatorOfFloat.setRepeatCount(-1);
        }
    }

    private static void c() {
        yqw.M(Looper.myLooper() == Looper.getMainLooper(), "Must be called from the main thread");
    }

    public final synchronized void a(final nzx nzxVar) {
        c();
        ValueAnimator valueAnimator = this.d;
        if (valueAnimator.isRunning()) {
            return;
        }
        valueAnimator.removeAllUpdateListeners();
        valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: mjp
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                acyk acykVar;
                int iA;
                nzx nzxVar2 = nzxVar;
                mjr mjrVar = this.a;
                aczr aczrVar = mjrVar.a;
                String str = aczrVar.f;
                long currentPlayTime = valueAnimator2.getCurrentPlayTime();
                float f = aczrVar.g;
                SenderStateOuterClass$SenderState senderStateOuterClass$SenderState = ((nyv) nzxVar2).e;
                if (senderStateOuterClass$SenderState == null) {
                    SenderStateOuterClass$SenderState senderStateOuterClass$SenderState2 = SenderStateOuterClass$SenderState.a;
                    acykVar = new acyk();
                } else {
                    acyk acykVar2 = new acyk();
                    acykVar2.B(senderStateOuterClass$SenderState);
                    acykVar = acykVar2;
                }
                float f2 = currentPlayTime;
                float fMin = f > 0.0f ? Math.min(f2 / f, 1.0f) : 0.0f;
                abxc abxcVar = aczt.b;
                aczs aczsVar = new aczs();
                if ((aczsVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                    aczsVar.y();
                }
                aczt acztVar = (aczt) aczsVar.b;
                str.getClass();
                acztVar.c |= 1;
                acztVar.d = str;
                if ((aczsVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                    aczsVar.y();
                }
                aczt acztVar2 = (aczt) aczsVar.b;
                acztVar2.c |= 2;
                acztVar2.e = f2;
                if ((aczsVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                    aczsVar.y();
                }
                aczt acztVar3 = (aczt) aczsVar.b;
                acztVar3.c |= 4;
                acztVar3.f = fMin;
                acykVar.f(abxcVar, (aczt) aczsVar.v());
                nzv nzvVarQ = nzxVar2.q();
                ((nyu) nzvVarQ).c = (SenderStateOuterClass$SenderState) acykVar.v();
                nzx nzxVarE = nzvVarQ.e();
                int i = aczrVar.d;
                if (i != 5) {
                    if (i == 4) {
                        ((oaa) mjrVar.b.a()).a(aczrVar.d == 4 ? (CommandOuterClass$Command) aczrVar.e : CommandOuterClass$Command.getDefaultInstance(), nzxVarE).k();
                        return;
                    }
                    return;
                }
                SenderStateOuterClass$SenderState senderStateOuterClass$SenderState3 = ((nyv) nzxVarE).e;
                if (senderStateOuterClass$SenderState3 != null) {
                    DirectUpdateDataRelay directUpdateDataRelay = (DirectUpdateDataRelay) mjrVar.c.a();
                    String str2 = aczrVar.d == 5 ? (String) aczrVar.e : "";
                    try {
                        int i2 = senderStateOuterClass$SenderState3.memoizedSerializedSize;
                        if ((i2 & Integer.MIN_VALUE) != 0) {
                            iA = abza.a.a(senderStateOuterClass$SenderState3.getClass()).a(senderStateOuterClass$SenderState3);
                            if (iA < 0) {
                                throw new IllegalStateException(a.b(iA, "serialized size must be non-negative, was "));
                            }
                        } else {
                            iA = i2 & Integer.MAX_VALUE;
                            if (iA == Integer.MAX_VALUE) {
                                iA = abza.a.a(senderStateOuterClass$SenderState3.getClass()).a(senderStateOuterClass$SenderState3);
                                if (iA < 0) {
                                    throw new IllegalStateException(a.b(iA, "serialized size must be non-negative, was "));
                                }
                                senderStateOuterClass$SenderState3.memoizedSerializedSize = (senderStateOuterClass$SenderState3.memoizedSerializedSize & Integer.MIN_VALUE) | iA;
                            }
                        }
                        byte[] bArr = new byte[iA];
                        boolean z = abvz.e;
                        abvw abvwVar = new abvw(bArr, 0, iA);
                        abza.a.a(senderStateOuterClass$SenderState3.getClass()).m(senderStateOuterClass$SenderState3, abwa.a(abvwVar));
                        abvwVar.K();
                        directUpdateDataRelay.send(str2, bArr);
                    } catch (IOException e) {
                        throw new RuntimeException(a.x(senderStateOuterClass$SenderState3, "Serializing ", " to a byte array threw an IOException (should never happen)."), e);
                    }
                }
            }
        });
        if ((this.a.c & 8) != 0) {
            valueAnimator.addListener(new mjq(this, nzxVar));
        }
        valueAnimator.start();
    }

    public final synchronized void b() {
        c();
        ValueAnimator valueAnimator = this.d;
        valueAnimator.removeAllUpdateListeners();
        valueAnimator.end();
    }
}
