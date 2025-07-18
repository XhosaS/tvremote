package defpackage;

import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ze {
    public final Bundle a;
    public List b;
    public List c;
    private Set d;

    public ze(zf zfVar) {
        this.b = new ArrayList();
        this.c = new ArrayList();
        this.d = new HashSet();
        if (zfVar == null) {
            throw new IllegalArgumentException("descriptor must not be null");
        }
        this.a = new Bundle(zfVar.a);
        this.b = zfVar.q();
        this.c = zfVar.p();
        this.d = zfVar.r();
    }

    public final zf a() {
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>(this.c);
        Bundle bundle = this.a;
        bundle.putParcelableArrayList("controlFilters", arrayList);
        bundle.putStringArrayList("groupMemberIds", new ArrayList<>(this.b));
        bundle.putStringArrayList("allowedPackages", new ArrayList<>(this.d));
        return new zf(bundle);
    }

    public final void b(Collection collection) {
        if (collection == null) {
            throw new IllegalArgumentException("filters must not be null");
        }
        if (collection.isEmpty()) {
            return;
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            IntentFilter intentFilter = (IntentFilter) it.next();
            if (intentFilter != null && !this.c.contains(intentFilter)) {
                this.c.add(intentFilter);
            }
        }
    }

    public final void c(Collection collection) {
        if (collection.isEmpty()) {
            return;
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (TextUtils.isEmpty(str)) {
                throw new IllegalArgumentException("groupMemberId must not be empty");
            }
            if (!this.b.contains(str)) {
                this.b.add(str);
            }
        }
    }

    public final void d(int i) {
        this.a.putInt("connectionState", i);
    }

    public final void e(String str) {
        this.a.putString("status", str);
    }

    public final void f(int i) {
        this.a.putInt("deviceType", i);
    }

    public final void g(boolean z) {
        this.a.putBoolean("enabled", z);
    }

    public final void h(Bundle bundle) {
        if (bundle == null) {
            this.a.putBundle("extras", null);
        } else {
            this.a.putBundle("extras", new Bundle(bundle));
        }
    }

    public final void i(int i) {
        this.a.putInt("playbackType", i);
    }

    public final void j(int i) {
        this.a.putInt("presentationDisplayId", i);
    }

    public final void k(int i) {
        this.a.putInt("volume", i);
    }

    public final void l(int i) {
        this.a.putInt("volumeHandling", i);
    }

    public final void m(int i) {
        this.a.putInt("volumeMax", i);
    }

    public ze(String str, String str2) {
        this.b = new ArrayList();
        this.c = new ArrayList();
        this.d = new HashSet();
        Bundle bundle = new Bundle();
        this.a = bundle;
        if (str != null) {
            bundle.putString("id", str);
            if (str2 != null) {
                bundle.putString("name", str2);
                return;
            }
            throw new NullPointerException("name must not be null");
        }
        throw new NullPointerException("id must not be null");
    }
}
