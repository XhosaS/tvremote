package defpackage;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.Set;
import java.util.SortedMap;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class zbn extends yum {
    private static final long serialVersionUID = 0;
    transient yrp e;

    public zbn(Map map, yrp yrpVar) {
        super(map);
        this.e = yrpVar;
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        Object object = objectInputStream.readObject();
        object.getClass();
        this.e = (yrp) object;
        Object object2 = objectInputStream.readObject();
        object2.getClass();
        k((Map) object2);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(this.e);
        objectOutputStream.writeObject(((yve) this).a);
    }

    @Override // defpackage.yum, defpackage.yve
    public final /* bridge */ /* synthetic */ Collection a() {
        return (List) this.e.eV();
    }

    @Override // defpackage.yve, defpackage.yvl
    public final Map h() {
        Map map = ((yve) this).a;
        return map instanceof NavigableMap ? new yuu(this, (NavigableMap) map) : map instanceof SortedMap ? new yux(this, (SortedMap) map) : new yuq(this, map);
    }

    @Override // defpackage.yve, defpackage.yvl
    public final Set i() {
        Map map = ((yve) this).a;
        return map instanceof NavigableMap ? new yuv(this, (NavigableMap) map) : map instanceof SortedMap ? new yuy(this, (SortedMap) map) : new yut(this, map);
    }
}
