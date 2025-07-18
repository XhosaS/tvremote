package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tgq {
    public static final tgq a = new tgq();
    private final List b = new ArrayList();

    private tgq() {
    }

    final synchronized void a() {
        List list = this.b;
        int size = list.size();
        while (true) {
            size--;
            if (size >= 0) {
                ((tgp) list.get(size)).a();
            }
        }
    }

    final synchronized void b() {
        List list = this.b;
        int size = list.size();
        while (true) {
            size--;
            if (size >= 0) {
                ((tgp) list.get(size)).b();
            }
        }
    }
}
