package j$.nio.file;

import j$.nio.file.attribute.AbstractC0060u;
import j$.nio.file.attribute.InterfaceC0043c;
import j$.nio.file.attribute.InterfaceC0047g;
import j$.nio.file.attribute.InterfaceC0052l;
import j$.nio.file.attribute.InterfaceC0055o;
import j$.util.C0097e;
import java.nio.file.AccessMode;
import java.nio.file.OpenOption;
import java.nio.file.StandardOpenOption;
import java.nio.file.StandardWatchEventKinds;
import java.nio.file.WatchEvent;
import java.nio.file.attribute.AclFileAttributeView;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.DosFileAttributeView;
import java.nio.file.attribute.DosFileAttributes;
import java.nio.file.attribute.FileOwnerAttributeView;
import java.nio.file.attribute.FileTime;
import java.nio.file.attribute.PosixFileAttributeView;
import java.nio.file.attribute.PosixFileAttributes;
import java.nio.file.attribute.PosixFilePermission;
import java.nio.file.attribute.UserDefinedFileAttributeView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: j$.nio.file.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract /* synthetic */ class AbstractC0040a {
    public static /* synthetic */ EnumC0064b a(AccessMode accessMode) {
        if (accessMode == null) {
            return null;
        }
        return accessMode == AccessMode.READ ? EnumC0064b.READ : accessMode == AccessMode.WRITE ? EnumC0064b.WRITE : EnumC0064b.EXECUTE;
    }

    public static D b(WatchEvent.Kind kind) {
        if (kind == null) {
            return null;
        }
        return kind == StandardWatchEventKinds.ENTRY_CREATE ? A.b : kind == StandardWatchEventKinds.ENTRY_DELETE ? A.c : kind == StandardWatchEventKinds.ENTRY_MODIFY ? A.d : kind == StandardWatchEventKinds.OVERFLOW ? A.a : kind instanceof C ? ((C) kind).a : new B(kind);
    }

    public static /* synthetic */ java.nio.file.LinkOption c(LinkOption linkOption) {
        if (linkOption == null) {
            return null;
        }
        return java.nio.file.LinkOption.NOFOLLOW_LINKS;
    }

    public static /* synthetic */ java.nio.file.StandardCopyOption d(StandardCopyOption standardCopyOption) {
        if (standardCopyOption == null) {
            return null;
        }
        return standardCopyOption == StandardCopyOption.REPLACE_EXISTING ? java.nio.file.StandardCopyOption.REPLACE_EXISTING : standardCopyOption == StandardCopyOption.COPY_ATTRIBUTES ? java.nio.file.StandardCopyOption.COPY_ATTRIBUTES : java.nio.file.StandardCopyOption.ATOMIC_MOVE;
    }

    public static /* synthetic */ StandardOpenOption e(y yVar) {
        if (yVar == null) {
            return null;
        }
        return yVar == y.READ ? StandardOpenOption.READ : yVar == y.WRITE ? StandardOpenOption.WRITE : yVar == y.APPEND ? StandardOpenOption.APPEND : yVar == y.TRUNCATE_EXISTING ? StandardOpenOption.TRUNCATE_EXISTING : yVar == y.CREATE ? StandardOpenOption.CREATE : yVar == y.CREATE_NEW ? StandardOpenOption.CREATE_NEW : yVar == y.DELETE_ON_CLOSE ? StandardOpenOption.DELETE_ON_CLOSE : yVar == y.SPARSE ? StandardOpenOption.SPARSE : yVar == y.SYNC ? StandardOpenOption.SYNC : StandardOpenOption.DSYNC;
    }

    public static WatchEvent.Kind f(D d) {
        if (d == null) {
            return null;
        }
        return d == A.b ? StandardWatchEventKinds.ENTRY_CREATE : d == A.c ? StandardWatchEventKinds.ENTRY_DELETE : d == A.d ? StandardWatchEventKinds.ENTRY_MODIFY : d == A.a ? StandardWatchEventKinds.OVERFLOW : d instanceof B ? ((B) d).a : new C(d);
    }

    public static Object g(Object obj) {
        if (obj == null) {
            return null;
        }
        return obj instanceof Path ? C0079q.i((Path) obj) : obj instanceof java.nio.file.Path ? C0078p.i((java.nio.file.Path) obj) : obj;
    }

    public static Class h(Class cls) {
        if (cls == null) {
            return null;
        }
        if (cls == BasicFileAttributeView.class) {
            return InterfaceC0047g.class;
        }
        if (cls == InterfaceC0047g.class) {
            return BasicFileAttributeView.class;
        }
        if (cls == PosixFileAttributeView.class) {
            return j$.nio.file.attribute.K.class;
        }
        if (cls == j$.nio.file.attribute.K.class) {
            return PosixFileAttributeView.class;
        }
        if (cls == FileOwnerAttributeView.class) {
            return j$.nio.file.attribute.A.class;
        }
        if (cls == j$.nio.file.attribute.A.class) {
            return FileOwnerAttributeView.class;
        }
        if (cls == InterfaceC0052l.class) {
            return DosFileAttributeView.class;
        }
        if (cls == DosFileAttributeView.class) {
            return InterfaceC0052l.class;
        }
        if (cls == j$.nio.file.attribute.S.class) {
            return UserDefinedFileAttributeView.class;
        }
        if (cls == UserDefinedFileAttributeView.class) {
            return j$.nio.file.attribute.S.class;
        }
        if (cls == InterfaceC0043c.class) {
            return AclFileAttributeView.class;
        }
        if (cls == AclFileAttributeView.class) {
            return InterfaceC0043c.class;
        }
        C0097e.a("java.nio.file.attribute.FileAttributeView", cls);
        throw null;
    }

    public static Class i(Class cls) {
        if (cls == null) {
            return null;
        }
        if (cls == BasicFileAttributes.class) {
            return j$.nio.file.attribute.BasicFileAttributes.class;
        }
        if (cls == j$.nio.file.attribute.BasicFileAttributes.class) {
            return BasicFileAttributes.class;
        }
        if (cls == PosixFileAttributes.class) {
            return j$.nio.file.attribute.N.class;
        }
        if (cls == j$.nio.file.attribute.N.class) {
            return PosixFileAttributes.class;
        }
        if (cls == InterfaceC0055o.class) {
            return DosFileAttributes.class;
        }
        if (cls == DosFileAttributes.class) {
            return InterfaceC0055o.class;
        }
        C0097e.a("java.nio.file.attribute.BasicFileAttributes", cls);
        throw null;
    }

    public static Map j(Map map) {
        if (map == null || map.isEmpty()) {
            return map;
        }
        HashMap map2 = new HashMap();
        for (String str : map.keySet()) {
            map2.put(str, k(map.get(str)));
        }
        return map2;
    }

    public static Object k(Object obj) {
        if (obj instanceof FileTime) {
            try {
                return AbstractC0060u.b((FileTime) obj);
            } catch (ClassCastException e) {
                C0097e.a("java.nio.file.attribute.FileTime", e);
                throw null;
            }
        }
        if (!(obj instanceof j$.nio.file.attribute.FileTime)) {
            return obj;
        }
        try {
            return AbstractC0060u.c((j$.nio.file.attribute.FileTime) obj);
        } catch (ClassCastException e2) {
            C0097e.a("java.nio.file.attribute.FileTime", e2);
            throw null;
        }
    }

    public static Set l(Set set) {
        if (set == null || set.isEmpty()) {
            return set;
        }
        HashSet hashSet = new HashSet();
        Object next = set.iterator().next();
        if (next instanceof InterfaceC0076n) {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                try {
                    hashSet.add(C0075m.a((InterfaceC0076n) it.next()));
                } catch (ClassCastException e) {
                    C0097e.a("java.nio.file.OpenOption", e);
                    throw null;
                }
            }
        } else {
            if (!(next instanceof OpenOption)) {
                C0097e.a("java.nio.file.OpenOption", next.getClass());
                throw null;
            }
            Iterator it2 = set.iterator();
            while (it2.hasNext()) {
                try {
                    hashSet.add(C0074l.a((OpenOption) it2.next()));
                } catch (ClassCastException e2) {
                    C0097e.a("java.nio.file.OpenOption", e2);
                    throw null;
                }
            }
        }
        return hashSet;
    }

    public static Set m(Set set) {
        if (set == null || set.isEmpty()) {
            return set;
        }
        HashSet hashSet = new HashSet();
        Object next = set.iterator().next();
        if (next instanceof j$.nio.file.attribute.O) {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                try {
                    j$.nio.file.attribute.O o = (j$.nio.file.attribute.O) it.next();
                    hashSet.add(o == null ? null : o == j$.nio.file.attribute.O.OWNER_READ ? PosixFilePermission.OWNER_READ : o == j$.nio.file.attribute.O.OWNER_WRITE ? PosixFilePermission.OWNER_WRITE : o == j$.nio.file.attribute.O.OWNER_EXECUTE ? PosixFilePermission.OWNER_EXECUTE : o == j$.nio.file.attribute.O.GROUP_READ ? PosixFilePermission.GROUP_READ : o == j$.nio.file.attribute.O.GROUP_WRITE ? PosixFilePermission.GROUP_WRITE : o == j$.nio.file.attribute.O.GROUP_EXECUTE ? PosixFilePermission.GROUP_EXECUTE : o == j$.nio.file.attribute.O.OTHERS_READ ? PosixFilePermission.OTHERS_READ : o == j$.nio.file.attribute.O.OTHERS_WRITE ? PosixFilePermission.OTHERS_WRITE : PosixFilePermission.OTHERS_EXECUTE);
                } catch (ClassCastException e) {
                    C0097e.a("java.nio.file.attribute.PosixFilePermission", e);
                    throw null;
                }
            }
        } else {
            if (!(next instanceof PosixFilePermission)) {
                C0097e.a("java.nio.file.attribute.PosixFilePermission", next.getClass());
                throw null;
            }
            Iterator it2 = set.iterator();
            while (it2.hasNext()) {
                try {
                    PosixFilePermission posixFilePermission = (PosixFilePermission) it2.next();
                    hashSet.add(posixFilePermission == null ? null : posixFilePermission == PosixFilePermission.OWNER_READ ? j$.nio.file.attribute.O.OWNER_READ : posixFilePermission == PosixFilePermission.OWNER_WRITE ? j$.nio.file.attribute.O.OWNER_WRITE : posixFilePermission == PosixFilePermission.OWNER_EXECUTE ? j$.nio.file.attribute.O.OWNER_EXECUTE : posixFilePermission == PosixFilePermission.GROUP_READ ? j$.nio.file.attribute.O.GROUP_READ : posixFilePermission == PosixFilePermission.GROUP_WRITE ? j$.nio.file.attribute.O.GROUP_WRITE : posixFilePermission == PosixFilePermission.GROUP_EXECUTE ? j$.nio.file.attribute.O.GROUP_EXECUTE : posixFilePermission == PosixFilePermission.OTHERS_READ ? j$.nio.file.attribute.O.OTHERS_READ : posixFilePermission == PosixFilePermission.OTHERS_WRITE ? j$.nio.file.attribute.O.OTHERS_WRITE : j$.nio.file.attribute.O.OTHERS_EXECUTE);
                } catch (ClassCastException e2) {
                    C0097e.a("java.nio.file.attribute.PosixFilePermission", e2);
                    throw null;
                }
            }
        }
        return hashSet;
    }

    public static List n(List list) {
        if (list == null || list.isEmpty()) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        Object obj = list.get(0);
        if (obj instanceof J) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                try {
                    J j = (J) it.next();
                    arrayList.add(j == null ? null : j instanceof H ? ((H) j).a : new I(j));
                } catch (ClassCastException e) {
                    C0097e.a("java.nio.file.WatchEvent", e);
                    throw null;
                }
            }
        } else {
            if (!(obj instanceof WatchEvent)) {
                C0097e.a("java.nio.file.WatchEvent", obj.getClass());
                throw null;
            }
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                try {
                    WatchEvent watchEvent = (WatchEvent) it2.next();
                    arrayList.add(watchEvent == null ? null : watchEvent instanceof I ? ((I) watchEvent).a : new H(watchEvent));
                } catch (ClassCastException e2) {
                    C0097e.a("java.nio.file.WatchEvent", e2);
                    throw null;
                }
            }
        }
        return arrayList;
    }
}
