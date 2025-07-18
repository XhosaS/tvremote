package defpackage;

import com.google.android.libraries.elements.interfaces.PerformOnceCommandController;
import java.util.HashSet;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ogy extends PerformOnceCommandController {
    public static final Set a = new HashSet();

    @Override // com.google.android.libraries.elements.interfaces.PerformOnceCommandController
    public final void clear() {
        Set set = a;
        synchronized (set) {
            set.clear();
        }
    }

    @Override // com.google.android.libraries.elements.interfaces.PerformOnceCommandController
    public final boolean contains(String str) {
        boolean zContains;
        Set set = a;
        synchronized (set) {
            zContains = set.contains(str);
        }
        return zContains;
    }

    @Override // com.google.android.libraries.elements.interfaces.PerformOnceCommandController
    public final void insert(String str) {
        Set set = a;
        synchronized (set) {
            set.add(str);
        }
    }
}
