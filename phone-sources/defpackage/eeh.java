package defpackage;

import java.util.ArrayDeque;
import java.util.List;
import java.util.PriorityQueue;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eeh {
    private final eeg c;
    private eef f;
    private final ArrayDeque d = new ArrayDeque();
    private final ArrayDeque e = new ArrayDeque();
    public final PriorityQueue a = new PriorityQueue();
    public int b = -1;

    public eeh(eeg eegVar) {
        this.c = eegVar;
    }

    private final void d(int i) {
        List list;
        while (true) {
            PriorityQueue priorityQueue = this.a;
            if (priorityQueue.size() <= i) {
                return;
            }
            eef eefVar = (eef) priorityQueue.poll();
            String str = edt.a;
            int i2 = 0;
            while (true) {
                list = eefVar.a;
                if (i2 >= list.size()) {
                    break;
                }
                this.c.a(eefVar.b, (edi) list.get(i2));
                this.d.push((edi) list.get(i2));
                i2++;
            }
            list.clear();
            eef eefVar2 = this.f;
            if (eefVar2 != null && eefVar2.b == eefVar.b) {
                this.f = null;
            }
            this.e.push(eefVar);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x001d, code lost:
    
        if (r7 < r0.b) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(long r7, defpackage.edi r9) {
        /*
            r6 = this;
            int r0 = r6.b
            if (r0 == 0) goto L99
            r1 = -1
            if (r0 == r1) goto L21
            java.util.PriorityQueue r0 = r6.a
            int r2 = r0.size()
            int r3 = r6.b
            if (r2 < r3) goto L21
            java.lang.Object r0 = r0.peek()
            eef r0 = (defpackage.eef) r0
            java.lang.String r2 = defpackage.edt.a
            long r2 = r0.b
            int r0 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r0 >= 0) goto L21
            goto L99
        L21:
            java.util.ArrayDeque r0 = r6.d
            boolean r2 = r0.isEmpty()
            if (r2 == 0) goto L2f
            edi r0 = new edi
            r0.<init>()
            goto L35
        L2f:
            java.lang.Object r0 = r0.pop()
            edi r0 = (defpackage.edi) r0
        L35:
            int r2 = r9.a()
            r0.G(r2)
            byte[] r2 = r9.a
            int r9 = r9.b
            byte[] r3 = r0.a
            int r4 = r0.a()
            r5 = 0
            java.lang.System.arraycopy(r2, r9, r3, r5, r4)
            eef r9 = r6.f
            if (r9 == 0) goto L5b
            long r2 = r9.b
            int r2 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r2 == 0) goto L55
            goto L5b
        L55:
            java.util.List r7 = r9.a
            r7.add(r0)
            return
        L5b:
            java.util.ArrayDeque r9 = r6.e
            boolean r2 = r9.isEmpty()
            if (r2 == 0) goto L69
            eef r9 = new eef
            r9.<init>()
            goto L6f
        L69:
            java.lang.Object r9 = r9.pop()
            eef r9 = (defpackage.eef) r9
        L6f:
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r2 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r2 == 0) goto L79
            r5 = 1
        L79:
            defpackage.a.H(r5)
            java.util.List r2 = r9.a
            boolean r3 = r2.isEmpty()
            defpackage.a.ab(r3)
            r9.b = r7
            r2.add(r0)
            java.util.PriorityQueue r7 = r6.a
            r7.add(r9)
            r6.f = r9
            int r7 = r6.b
            if (r7 == r1) goto L98
            r6.d(r7)
        L98:
            return
        L99:
            eeg r0 = r6.c
            r0.a(r7, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eeh.a(long, edi):void");
    }

    public final void b() {
        d(0);
    }

    public final void c(int i) {
        a.ab(i >= 0);
        this.b = i;
        d(i);
    }
}
