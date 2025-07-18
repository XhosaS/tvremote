package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tkp {
    public static final tui a = tui.l("com/google/android/tv/remote/support/discovery/Discoverer");
    public final List b;
    public tkq c;

    public tkp(Context context) {
        ArrayList arrayList = new ArrayList();
        this.b = arrayList;
        ArrayList arrayList2 = new ArrayList();
        boolean z = Boolean.parseBoolean(System.getProperty("prop.android.tv.force_legacy_discoverer", "false"));
        boolean z2 = Boolean.parseBoolean(System.getProperty("prop.android.tv.force_system_discoverer", "false"));
        if (z && z2) {
            throw new IllegalStateException("You cannot force both Legacy and System Resolvers");
        }
        if (z) {
            ((tug) ((tug) a.b()).j("com/google/android/tv/remote/support/discovery/Discoverer", "getAgents", 236, "Discoverer.java")).s("Forced using legacy discovery code");
            arrayList2.add(new tks(context));
        } else if (z2) {
            ((tug) ((tug) a.b()).j("com/google/android/tv/remote/support/discovery/Discoverer", "getAgents", 239, "Discoverer.java")).s("Forced using Network Service Discovery");
            arrayList2.add(new tkw(context));
        } else {
            ((tug) ((tug) a.b()).j("com/google/android/tv/remote/support/discovery/Discoverer", "getAgents", 243, "Discoverer.java")).s("Using legacy discovery code");
            arrayList2.add(new tks(context));
        }
        ((tug) ((tug) a.b()).j("com/google/android/tv/remote/support/discovery/Discoverer", "getAgents", 248, "Discoverer.java")).s("Adding BT Discovery");
        arrayList2.add(new tkl(new tki(context)));
        arrayList.addAll(arrayList2);
    }

    public final void a() {
        if (this.c != null) {
            Iterator it = this.b.iterator();
            while (it.hasNext()) {
                ((tkr) it.next()).b();
            }
            this.c = null;
        }
    }
}
