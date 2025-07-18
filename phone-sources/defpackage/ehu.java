package defpackage;

import android.content.Context;
import android.media.AudioManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ehu {
    public eht a;
    public dyo b;
    public int c;
    private final ttm e;
    private final Handler f;
    private ebq h;
    public float d = 1.0f;
    private int g = 0;

    public ehu(Context context, Looper looper, eht ehtVar) {
        this.e = sij.l(new eij(context, 1));
        this.a = ehtVar;
        this.f = new Handler(looper);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0051  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int a(boolean r9, int r10) {
        /*
            r8 = this;
            r0 = 0
            r1 = 1
            if (r10 == r1) goto L7e
            int r10 = r8.c
            if (r10 != r1) goto L7e
            r10 = -1
            r2 = 3
            if (r9 == 0) goto L75
            int r9 = r8.g
            r3 = 2
            if (r9 != r3) goto L12
            return r1
        L12:
            ebq r9 = r8.h
            if (r9 != 0) goto L2f
            dyo r9 = defpackage.dyo.a
            boolean r9 = r8.e()
            dyo r4 = r8.b
            defpackage.a.aq(r4)
            ehs r5 = new ehs
            r5.<init>()
            android.os.Handler r6 = r8.f
            ebq r7 = new ebq
            r7.<init>(r5, r6, r4, r9)
            r8.h = r7
        L2f:
            ttm r9 = r8.e
            java.lang.Object r9 = r9.get()
            android.media.AudioManager r9 = (android.media.AudioManager) r9
            ebq r4 = r8.h
            int r5 = android.os.Build.VERSION.SDK_INT
            r6 = 26
            if (r5 < r6) goto L48
            android.media.AudioFocusRequest r0 = r4.a()
            int r9 = defpackage.kw$$ExternalSyntheticApiModelOutline0.m(r9, r0)
            goto L6b
        L48:
            android.media.AudioManager$OnAudioFocusChangeListener r5 = r4.b
            dyo r6 = r4.d
            int r7 = r6.h
            r7 = r7 & r1
            if (r7 != r1) goto L53
        L51:
            r0 = r1
            goto L65
        L53:
            int r6 = r6.i
            switch(r6) {
                case 2: goto L65;
                case 3: goto L63;
                case 4: goto L61;
                case 5: goto L5f;
                case 6: goto L5d;
                case 7: goto L5f;
                case 8: goto L5f;
                case 9: goto L5f;
                case 10: goto L5f;
                case 11: goto L5a;
                case 12: goto L58;
                case 13: goto L51;
                default: goto L58;
            }
        L58:
            r0 = r2
            goto L65
        L5a:
            r0 = 10
            goto L65
        L5d:
            r0 = r3
            goto L65
        L5f:
            r0 = 5
            goto L65
        L61:
            r0 = 4
            goto L65
        L63:
            r0 = 8
        L65:
            int r2 = r4.a
            int r9 = r9.requestAudioFocus(r5, r0, r1)
        L6b:
            if (r9 != r1) goto L71
            r8.d(r3)
            return r1
        L71:
            r8.d(r1)
            return r10
        L75:
            int r9 = r8.g
            if (r9 == r1) goto L7d
            if (r9 == r2) goto L7c
            return r1
        L7c:
            return r0
        L7d:
            return r10
        L7e:
            r8.b()
            r8.d(r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ehu.a(boolean, int):int");
    }

    public final void b() {
        int i = this.g;
        if (i == 1 || i == 0 || this.h == null) {
            return;
        }
        AudioManager audioManager = (AudioManager) this.e.get();
        ebq ebqVar = this.h;
        if (Build.VERSION.SDK_INT >= 26) {
            audioManager.abandonAudioFocusRequest(ebqVar.a());
        } else {
            audioManager.abandonAudioFocus(ebqVar.b);
        }
    }

    public final void c(int i) {
        eht ehtVar = this.a;
        if (ehtVar != null) {
            ((eje) ehtVar).d.i(33, i, 0).l();
        }
    }

    public final void d(int i) {
        if (this.g == i) {
            return;
        }
        this.g = i;
        float f = i == 4 ? 0.2f : 1.0f;
        if (this.d != f) {
            this.d = f;
            eht ehtVar = this.a;
            if (ehtVar != null) {
                ((eje) ehtVar).d.f(34);
            }
        }
    }

    public final boolean e() {
        dyo dyoVar = this.b;
        return dyoVar != null && dyoVar.g == 1;
    }
}
