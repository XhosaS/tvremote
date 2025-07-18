package defpackage;

import java.net.Inet4Address;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class afvv {
    public List a;
    public int b = 0;
    private final boolean c;

    public afvv(List list, boolean z) {
        this.c = z;
        c(list);
    }

    private final List g(List list, List list2) {
        if (list.isEmpty()) {
            return list2;
        }
        if (list2.isEmpty()) {
            return list;
        }
        ArrayList arrayList = new ArrayList(list.size() + list2.size());
        for (int i = 0; i < Math.max(list.size(), list2.size()); i++) {
            if (i < list.size()) {
                arrayList.add((afvu) list.get(i));
            }
            if (i < list2.size()) {
                arrayList.add((afvu) list2.get(i));
            }
        }
        return arrayList;
    }

    public final int a() {
        return this.a.size();
    }

    public final SocketAddress b() {
        if (e()) {
            return ((afvu) this.a.get(this.b)).b;
        }
        throw new IllegalStateException("Index is past the end of the address group list");
    }

    public final void c(List list) {
        List listG;
        list.getClass();
        if (this.c) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            Boolean bool = null;
            for (int i = 0; i < ((zcg) list).d; i++) {
                affy affyVar = (affy) list.get(i);
                int i2 = 0;
                while (true) {
                    List list2 = affyVar.b;
                    if (i2 < list2.size()) {
                        SocketAddress socketAddress = (SocketAddress) list2.get(i2);
                        if ((socketAddress instanceof InetSocketAddress) && (((InetSocketAddress) socketAddress).getAddress() instanceof Inet4Address)) {
                            if (bool == null) {
                                bool = false;
                            }
                            arrayList.add(new afvu(affyVar.c, socketAddress));
                        } else {
                            if (bool == null) {
                                bool = true;
                            }
                            arrayList2.add(new afvu(affyVar.c, socketAddress));
                        }
                        i2++;
                    }
                }
            }
            listG = (bool == null || !bool.booleanValue()) ? g(arrayList, arrayList2) : g(arrayList2, arrayList);
        } else {
            ArrayList arrayList3 = new ArrayList();
            for (int i3 = 0; i3 < ((zcg) list).d; i3++) {
                affy affyVar2 = (affy) list.get(i3);
                int i4 = 0;
                while (true) {
                    List list3 = affyVar2.b;
                    if (i4 < list3.size()) {
                        arrayList3.add(new afvu(affyVar2.c, (SocketAddress) list3.get(i4)));
                        i4++;
                    }
                }
            }
            listG = arrayList3;
        }
        this.a = listG;
        this.b = 0;
    }

    public final boolean d() {
        if (!e()) {
            return false;
        }
        this.b++;
        return e();
    }

    public final boolean e() {
        return this.b < this.a.size();
    }

    public final boolean f(SocketAddress socketAddress) {
        socketAddress.getClass();
        for (int i = 0; i < this.a.size(); i++) {
            if (((afvu) this.a.get(i)).b.equals(socketAddress)) {
                this.b = i;
                return true;
            }
        }
        return false;
    }
}
