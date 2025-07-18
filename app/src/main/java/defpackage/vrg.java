package defpackage;

import java.util.ArrayDeque;
import java.util.Deque;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vrg {
    private final Deque a;
    private final yqi b;
    private final int c;

    public vrg(int i, yqi yqiVar) {
        this.c = i;
        this.b = yqiVar;
        this.a = new ArrayDeque(i);
    }

    public final void a() {
        while (true) {
            Object objPoll = this.a.poll();
            if (objPoll == null) {
                return;
            }
        }
    }

    public final boolean b() {
        return this.a.isEmpty();
    }

    public final boolean c(Object obj) {
        Deque deque = this.a;
        ArrayDeque arrayDeque = new ArrayDeque(deque.size());
        while (deque.peek() != null && deque.peek() != obj) {
            arrayDeque.add(deque.poll());
        }
        if (deque.peek() != obj) {
            while (true) {
                Object objPollLast = arrayDeque.pollLast();
                if (objPollLast == null) {
                    return false;
                }
                deque.addFirst(objPollLast);
            }
        } else {
            deque.poll();
            while (true) {
                Object objPoll = arrayDeque.poll();
                if (objPoll == null) {
                    return true;
                }
            }
        }
    }

    public final void d(Object obj) {
        Deque deque = this.a;
        ArrayDeque arrayDeque = new ArrayDeque(deque.size());
        while (true) {
            Object objPoll = deque.poll();
            if (objPoll == null) {
                break;
            } else if (arrayDeque.size() < this.c - 1) {
                arrayDeque.add(objPoll);
            }
        }
        while (true) {
            Object objPoll2 = arrayDeque.poll();
            if (objPoll2 == null) {
                deque.add(obj);
                return;
            }
            deque.add(objPoll2);
        }
    }
}
