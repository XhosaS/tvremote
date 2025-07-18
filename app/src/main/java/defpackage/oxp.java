package defpackage;

import com.google.protobuf.MessageLite;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class oxp implements Map {
    private final Map a = new ConcurrentHashMap();

    public abstract ozl a(MessageLite messageLite);

    @Override // java.util.Map
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final ozl put(String str, ozl ozlVar) {
        str.getClass();
        ozlVar.getClass();
        return (ozl) this.a.put(str, ozlVar);
    }

    public abstract String c(MessageLite messageLite);

    @Override // java.util.Map
    public final void clear() {
        this.a.clear();
    }

    @Override // java.util.Map
    public final /* bridge */ boolean containsKey(Object obj) {
        if (!(obj instanceof String)) {
            return false;
        }
        String str = (String) obj;
        str.getClass();
        return this.a.containsKey(str);
    }

    @Override // java.util.Map
    public final /* bridge */ boolean containsValue(Object obj) {
        if (!(obj instanceof ozl)) {
            return false;
        }
        ozl ozlVar = (ozl) obj;
        ozlVar.getClass();
        return this.a.containsValue(ozlVar);
    }

    public final Collection d() {
        return this.a.values();
    }

    public final Set e() {
        return this.a.keySet();
    }

    @Override // java.util.Map
    public final /* bridge */ Set entrySet() {
        return this.a.entrySet();
    }

    public final void f(List list, boolean z) {
        Set setZ = agqq.z(e());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            MessageLite messageLite = (MessageLite) it.next();
            String strC = c(messageLite);
            Object obj = get(strC);
            if (obj != null) {
                setZ.remove(strC);
                ((ozl) obj).l(messageLite);
            } else {
                put(strC, a(messageLite));
            }
        }
        if (z) {
            e().removeAll(setZ);
        }
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        if (!(obj instanceof String)) {
            return null;
        }
        String str = (String) obj;
        str.getClass();
        return (ozl) this.a.get(str);
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.a.isEmpty();
    }

    @Override // java.util.Map
    public final /* bridge */ Set keySet() {
        return e();
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        map.getClass();
        this.a.putAll(map);
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ Object remove(Object obj) {
        if (!(obj instanceof String)) {
            return null;
        }
        String str = (String) obj;
        str.getClass();
        return (ozl) this.a.remove(str);
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        return this.a.size();
    }

    @Override // java.util.Map
    public final /* bridge */ Collection values() {
        return d();
    }
}
