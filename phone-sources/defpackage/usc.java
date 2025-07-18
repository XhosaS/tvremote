package defpackage;

import com.google.common.collect.ImmutableList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class usc {
    public volatile ImmutableList b;
    public final Set a = Collections.newSetFromMap(new ir());
    public final Object c = new Object();

    public final void a(List list, String str) {
        synchronized (this.c) {
            Set set = this.a;
            set.removeAll(list);
            if (str != null) {
                set.add(str);
            }
            this.b = null;
        }
    }
}
