package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class mth implements Handler.Callback {
    public lwx c;
    public lwl d;
    public int e;
    public int f;
    private final mtm i;
    public long g = -1;
    public long h = -1;
    public final List b = new ArrayList();
    public final Handler a = new Handler(Looper.getMainLooper(), this);

    public mth(mtm mtmVar) {
        this.i = mtmVar;
    }

    public final void a() {
        this.a.removeMessages(0);
        mtm mtmVar = this.i;
        List list = mtmVar.a;
        if (!list.isEmpty()) {
            list.clear();
            mtmVar.b.clear();
            mtmVar.notifyItemRangeRemoved(0, list.size());
        }
        this.f = 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b() {
        /*
            r15 = this;
            lwx r0 = r15.c
            if (r0 == 0) goto La1
            lwl r0 = r15.d
            if (r0 != 0) goto La
            goto La1
        La:
            int r0 = r0.j()
            r1 = -1
            if (r0 == r1) goto La1
            long r2 = android.os.SystemClock.elapsedRealtime()
            long r4 = r15.g
            long r6 = (long) r0
            r8 = -1
            int r10 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            r11 = 1
            r12 = 0
            if (r10 == 0) goto L39
            long r13 = r15.h
            int r8 = (r13 > r8 ? 1 : (r13 == r8 ? 0 : -1))
            if (r8 != 0) goto L27
            goto L39
        L27:
            int r8 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r8 >= 0) goto L2d
        L2b:
            r4 = r11
            goto L3a
        L2d:
            long r8 = r2 - r13
            long r4 = r6 - r4
            r13 = 1000(0x3e8, double:4.94E-321)
            long r8 = r8 + r13
            int r4 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r4 <= 0) goto L39
            goto L2b
        L39:
            r4 = r12
        L3a:
            r15.g = r6
            r15.h = r2
            int r2 = r15.f
            if (r2 == 0) goto L44
            if (r4 == 0) goto L66
        L44:
            r15.a()
            lwx r2 = r15.c
            java.util.List r2 = r2.b
            int r3 = r2.size()
            r4 = r12
        L50:
            if (r4 >= r3) goto L66
            java.lang.Object r5 = r2.get(r4)
            lwq r5 = (defpackage.lwq) r5
            boolean r6 = r5.c(r0)
            if (r6 == 0) goto L63
            mtm r6 = r15.i
            r6.a(r5)
        L63:
            int r4 = r4 + 1
            goto L50
        L66:
            int r2 = r15.f
            if (r2 == r11) goto La1
            gb r2 = new gb
            r3 = 0
            r2.<init>(r3, r0, r12)
            java.util.List r3 = r15.b
            bxy r4 = defpackage.bxy.g
            int r2 = java.util.Collections.binarySearch(r3, r2, r4)
            r15.e = r2
            if (r2 >= 0) goto L80
            int r2 = -r2
            int r2 = r2 + r1
            r15.e = r2
        L80:
            int r1 = r3.size()
            if (r2 >= r1) goto L9f
            int r1 = r15.e
            int r2 = r1 + 1
            r15.e = r2
            java.lang.Object r1 = r3.get(r1)
            gb r1 = (defpackage.gb) r1
            android.os.Handler r2 = r15.a
            android.os.Message r3 = android.os.Message.obtain(r2, r12, r1)
            int r1 = r1.a
            int r1 = r1 - r0
            long r0 = (long) r1
            r2.sendMessageDelayed(r3, r0)
        L9f:
            r15.f = r11
        La1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mth.b():void");
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        mtm mtmVar;
        Object obj;
        List list;
        int iIndexOf;
        gb gbVar = (gb) message.obj;
        int iJ = this.d.j();
        if (iJ == -1) {
            this.a.sendMessageDelayed(Message.obtain(message), 1000L);
            return true;
        }
        int i = gbVar.a - iJ;
        if (i > 50) {
            this.a.sendMessageDelayed(Message.obtain(message), i);
            return true;
        }
        if (Math.abs(i) > 5000) {
            a();
            b();
            return true;
        }
        int i2 = gbVar.b;
        if (i2 == 1) {
            this.i.a((lwq) gbVar.c);
        } else if (i2 == 2) {
            mtm mtmVar2 = this.i;
            Object obj2 = gbVar.c;
            int iIndexOf2 = mtmVar2.a.indexOf(obj2);
            if (iIndexOf2 == -1) {
                mtmVar2.a((lwq) obj2);
            } else {
                mtmVar2.b.remove(obj2);
                mtmVar2.notifyItemChanged(iIndexOf2);
            }
        } else if (i2 == 3) {
            mtm mtmVar3 = this.i;
            Object obj3 = gbVar.c;
            int iIndexOf3 = mtmVar3.a.indexOf(obj3);
            if (iIndexOf3 != -1) {
                mtmVar3.b.add(obj3);
                mtmVar3.notifyItemChanged(iIndexOf3);
            }
        } else if (i2 == 4 && (iIndexOf = (list = (mtmVar = this.i).a).indexOf((obj = gbVar.c))) != -1) {
            list.remove(iIndexOf);
            mtmVar.b.remove(obj);
            mtmVar.notifyItemRemoved(iIndexOf);
        }
        int i3 = this.e;
        List list2 = this.b;
        if (i3 < list2.size()) {
            int i4 = this.e;
            this.e = i4 + 1;
            gb gbVar2 = (gb) list2.get(i4);
            int i5 = gbVar2.a - iJ;
            Handler handler = this.a;
            handler.sendMessageDelayed(Message.obtain(handler, 0, gbVar2), i5 > 0 ? i5 : 0L);
        }
        return true;
    }
}
