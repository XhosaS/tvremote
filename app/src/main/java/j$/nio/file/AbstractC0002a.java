package j$.nio.file;

import j$.nio.file.attribute.AbstractC0023v;
import j$.nio.file.attribute.InterfaceC0005c;
import j$.nio.file.attribute.InterfaceC0009g;
import j$.nio.file.attribute.InterfaceC0012j;
import j$.nio.file.attribute.InterfaceC0015m;
import j$.nio.file.attribute.InterfaceC0018p;
import j$.util.C0069d;
import java.nio.file.AccessMode;
import java.nio.file.LinkOption;
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
/* loaded from: classes3.dex */
public abstract /* synthetic */ class AbstractC0002a {
    public static /* synthetic */ EnumC0028b a(AccessMode accessMode) {
        if (accessMode == null) {
            return null;
        }
        return accessMode == AccessMode.READ ? EnumC0028b.READ : accessMode == AccessMode.WRITE ? EnumC0028b.WRITE : EnumC0028b.EXECUTE;
    }

    public static E b(WatchEvent.Kind kind) {
        if (kind == null) {
            return null;
        }
        return kind == StandardWatchEventKinds.ENTRY_CREATE ? B.b : kind == StandardWatchEventKinds.ENTRY_DELETE ? B.c : kind == StandardWatchEventKinds.ENTRY_MODIFY ? B.d : kind == StandardWatchEventKinds.OVERFLOW ? B.a : kind instanceof D ? ((D) kind).a : new C(kind);
    }

    public static /* synthetic */ LinkOption c(EnumC0038l enumC0038l) {
        if (enumC0038l == null) {
            return null;
        }
        return LinkOption.NOFOLLOW_LINKS;
    }

    public static /* synthetic */ java.nio.file.StandardCopyOption d(StandardCopyOption standardCopyOption) {
        if (standardCopyOption == null) {
            return null;
        }
        return standardCopyOption == StandardCopyOption.REPLACE_EXISTING ? java.nio.file.StandardCopyOption.REPLACE_EXISTING : standardCopyOption == StandardCopyOption.COPY_ATTRIBUTES ? java.nio.file.StandardCopyOption.COPY_ATTRIBUTES : java.nio.file.StandardCopyOption.ATOMIC_MOVE;
    }

    public static /* synthetic */ StandardOpenOption e(z zVar) {
        if (zVar == null) {
            return null;
        }
        return zVar == z.READ ? StandardOpenOption.READ : zVar == z.WRITE ? StandardOpenOption.WRITE : zVar == z.APPEND ? StandardOpenOption.APPEND : zVar == z.TRUNCATE_EXISTING ? StandardOpenOption.TRUNCATE_EXISTING : zVar == z.CREATE ? StandardOpenOption.CREATE : zVar == z.CREATE_NEW ? StandardOpenOption.CREATE_NEW : zVar == z.DELETE_ON_CLOSE ? StandardOpenOption.DELETE_ON_CLOSE : zVar == z.SPARSE ? StandardOpenOption.SPARSE : zVar == z.SYNC ? StandardOpenOption.SYNC : StandardOpenOption.DSYNC;
    }

    public static WatchEvent.Kind f(E e) {
        if (e == null) {
            return null;
        }
        return e == B.b ? StandardWatchEventKinds.ENTRY_CREATE : e == B.c ? StandardWatchEventKinds.ENTRY_DELETE : e == B.d ? StandardWatchEventKinds.ENTRY_MODIFY : e == B.a ? StandardWatchEventKinds.OVERFLOW : e instanceof C ? ((C) e).a : new D(e);
    }

    public static Object g(Object obj) {
        if (obj == null) {
            return null;
        }
        return obj instanceof Path ? r.i((Path) obj) : obj instanceof java.nio.file.Path ? C0043q.i((java.nio.file.Path) obj) : obj;
    }

    public static Class h(Class cls) {
        if (cls == null) {
            return null;
        }
        if (cls == BasicFileAttributeView.class) {
            return InterfaceC0009g.class;
        }
        if (cls == InterfaceC0009g.class) {
            return BasicFileAttributeView.class;
        }
        if (cls == PosixFileAttributeView.class) {
            return j$.nio.file.attribute.M.class;
        }
        if (cls == j$.nio.file.attribute.M.class) {
            return PosixFileAttributeView.class;
        }
        if (cls == FileOwnerAttributeView.class) {
            return j$.nio.file.attribute.B.class;
        }
        if (cls == j$.nio.file.attribute.B.class) {
            return FileOwnerAttributeView.class;
        }
        if (cls == InterfaceC0015m.class) {
            return DosFileAttributeView.class;
        }
        if (cls == DosFileAttributeView.class) {
            return InterfaceC0015m.class;
        }
        if (cls == j$.nio.file.attribute.U.class) {
            return UserDefinedFileAttributeView.class;
        }
        if (cls == UserDefinedFileAttributeView.class) {
            return j$.nio.file.attribute.U.class;
        }
        if (cls == InterfaceC0005c.class) {
            return AclFileAttributeView.class;
        }
        if (cls == AclFileAttributeView.class) {
            return InterfaceC0005c.class;
        }
        C0069d.a("java.nio.file.attribute.FileAttributeView", cls);
        throw null;
    }

    public static Class i(Class cls) {
        if (cls == null) {
            return null;
        }
        if (cls == BasicFileAttributes.class) {
            return InterfaceC0012j.class;
        }
        if (cls == InterfaceC0012j.class) {
            return BasicFileAttributes.class;
        }
        if (cls == PosixFileAttributes.class) {
            return j$.nio.file.attribute.P.class;
        }
        if (cls == j$.nio.file.attribute.P.class) {
            return PosixFileAttributes.class;
        }
        if (cls == InterfaceC0018p.class) {
            return DosFileAttributes.class;
        }
        if (cls == DosFileAttributes.class) {
            return InterfaceC0018p.class;
        }
        C0069d.a("java.nio.file.attribute.BasicFileAttributes", cls);
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
                return AbstractC0023v.b((FileTime) obj);
            } catch (ClassCastException e) {
                C0069d.a("java.nio.file.attribute.FileTime", e);
                throw null;
            }
        }
        if (!(obj instanceof j$.nio.file.attribute.G)) {
            return obj;
        }
        try {
            return AbstractC0023v.c((j$.nio.file.attribute.G) obj);
        } catch (ClassCastException e2) {
            C0069d.a("java.nio.file.attribute.FileTime", e2);
            throw null;
        }
    }

    public static Set l(Set set) {
        if (set == null || set.isEmpty()) {
            return set;
        }
        HashSet hashSet = new HashSet();
        Object next = set.iterator().next();
        if (next instanceof InterfaceC0041o) {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                try {
                    hashSet.add(C0040n.a((InterfaceC0041o) it.next()));
                } catch (ClassCastException e) {
                    C0069d.a("java.nio.file.OpenOption", e);
                    throw null;
                }
            }
        } else {
            if (!(next instanceof OpenOption)) {
                C0069d.a("java.nio.file.OpenOption", next.getClass());
                throw null;
            }
            Iterator it2 = set.iterator();
            while (it2.hasNext()) {
                try {
                    hashSet.add(C0039m.a((OpenOption) it2.next()));
                } catch (ClassCastException e2) {
                    C0069d.a("java.nio.file.OpenOption", e2);
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
        if (next instanceof j$.nio.file.attribute.Q) {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                try {
                    j$.nio.file.attribute.Q q = (j$.nio.file.attribute.Q) it.next();
                    hashSet.add(q == null ? null : q == j$.nio.file.attribute.Q.OWNER_READ ? PosixFilePermission.OWNER_READ : q == j$.nio.file.attribute.Q.OWNER_WRITE ? PosixFilePermission.OWNER_WRITE : q == j$.nio.file.attribute.Q.OWNER_EXECUTE ? PosixFilePermission.OWNER_EXECUTE : q == j$.nio.file.attribute.Q.GROUP_READ ? PosixFilePermission.GROUP_READ : q == j$.nio.file.attribute.Q.GROUP_WRITE ? PosixFilePermission.GROUP_WRITE : q == j$.nio.file.attribute.Q.GROUP_EXECUTE ? PosixFilePermission.GROUP_EXECUTE : q == j$.nio.file.attribute.Q.OTHERS_READ ? PosixFilePermission.OTHERS_READ : q == j$.nio.file.attribute.Q.OTHERS_WRITE ? PosixFilePermission.OTHERS_WRITE : PosixFilePermission.OTHERS_EXECUTE);
                } catch (ClassCastException e) {
                    C0069d.a("java.nio.file.attribute.PosixFilePermission", e);
                    throw null;
                }
            }
        } else {
            if (!(next instanceof PosixFilePermission)) {
                C0069d.a("java.nio.file.attribute.PosixFilePermission", next.getClass());
                throw null;
            }
            Iterator it2 = set.iterator();
            while (it2.hasNext()) {
                try {
                    PosixFilePermission posixFilePermission = (PosixFilePermission) it2.next();
                    hashSet.add(posixFilePermission == null ? null : posixFilePermission == PosixFilePermission.OWNER_READ ? j$.nio.file.attribute.Q.OWNER_READ : posixFilePermission == PosixFilePermission.OWNER_WRITE ? j$.nio.file.attribute.Q.OWNER_WRITE : posixFilePermission == PosixFilePermission.OWNER_EXECUTE ? j$.nio.file.attribute.Q.OWNER_EXECUTE : posixFilePermission == PosixFilePermission.GROUP_READ ? j$.nio.file.attribute.Q.GROUP_READ : posixFilePermission == PosixFilePermission.GROUP_WRITE ? j$.nio.file.attribute.Q.GROUP_WRITE : posixFilePermission == PosixFilePermission.GROUP_EXECUTE ? j$.nio.file.attribute.Q.GROUP_EXECUTE : posixFilePermission == PosixFilePermission.OTHERS_READ ? j$.nio.file.attribute.Q.OTHERS_READ : posixFilePermission == PosixFilePermission.OTHERS_WRITE ? j$.nio.file.attribute.Q.OTHERS_WRITE : j$.nio.file.attribute.Q.OTHERS_EXECUTE);
                } catch (ClassCastException e2) {
                    C0069d.a("java.nio.file.attribute.PosixFilePermission", e2);
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
        if (obj instanceof K) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                try {
                    K k = (K) it.next();
                    arrayList.add(k == null ? null : k instanceof I ? ((I) k).a : new J(k));
                } catch (ClassCastException e) {
                    C0069d.a("java.nio.file.WatchEvent", e);
                    throw null;
                }
            }
        } else {
            if (!(obj instanceof WatchEvent)) {
                C0069d.a("java.nio.file.WatchEvent", obj.getClass());
                throw null;
            }
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                try {
                    WatchEvent watchEvent = (WatchEvent) it2.next();
                    arrayList.add(watchEvent == null ? null : watchEvent instanceof J ? ((J) watchEvent).a : new I(watchEvent));
                } catch (ClassCastException e2) {
                    C0069d.a("java.nio.file.WatchEvent", e2);
                    throw null;
                }
            }
        }
        return arrayList;
    }
}
