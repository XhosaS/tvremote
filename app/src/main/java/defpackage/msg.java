package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public class msg {
    public int a = -1;
    public int b = -1;
    public int c = -1;
    public final List d = new ArrayList();
    public HashMap e = new HashMap();

    final void a(msf msfVar) {
        ArrayList arrayList = msfVar.e;
        for (int i = 0; i < arrayList.size(); i++) {
            this.e.remove(Integer.valueOf(((mse) arrayList.get(i)).a));
        }
        this.d.remove(msfVar);
    }
}
