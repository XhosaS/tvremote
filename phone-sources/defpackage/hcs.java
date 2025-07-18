package defpackage;

import android.graphics.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hcs implements hct, hcq {
    private final Path a = new Path();
    private final Path b = new Path();
    private final Path c = new Path();
    private final List d = new ArrayList();
    private final hey e;

    public hcs(hey heyVar) {
        this.e = heyVar;
    }

    private final void a(Path.Op op) {
        Path path = this.b;
        path.reset();
        Path path2 = this.a;
        path2.reset();
        List list = this.d;
        int size = list.size();
        while (true) {
            size--;
            if (size <= 0) {
                break;
            }
            hct hctVar = (hct) list.get(size);
            if (hctVar instanceof hck) {
                hck hckVar = (hck) hctVar;
                List listJ = hckVar.j();
                int size2 = listJ.size();
                while (true) {
                    size2--;
                    if (size2 >= 0) {
                        Path pathI = ((hct) listJ.get(size2)).i();
                        pathI.transform(hckVar.h());
                        path.addPath(pathI);
                    }
                }
            } else {
                path.addPath(hctVar.i());
            }
        }
        hct hctVar2 = (hct) list.get(0);
        if (hctVar2 instanceof hck) {
            hck hckVar2 = (hck) hctVar2;
            List listJ2 = hckVar2.j();
            for (int i = 0; i < listJ2.size(); i++) {
                Path pathI2 = ((hct) listJ2.get(i)).i();
                pathI2.transform(hckVar2.h());
                path2.addPath(pathI2);
            }
        } else {
            path2.set(hctVar2.i());
        }
        this.c.op(path2, path, op);
    }

    @Override // defpackage.hcj
    public final void f(List list, List list2) {
        int i = 0;
        while (true) {
            List list3 = this.d;
            if (i >= list3.size()) {
                return;
            }
            ((hct) list3.get(i)).f(list, list2);
            i++;
        }
    }

    @Override // defpackage.hcj
    public final String g() {
        throw null;
    }

    @Override // defpackage.hcq
    public final void h(ListIterator listIterator) {
        while (listIterator.hasPrevious() && listIterator.previous() != this) {
        }
        while (listIterator.hasPrevious()) {
            hcj hcjVar = (hcj) listIterator.previous();
            if (hcjVar instanceof hct) {
                this.d.add((hct) hcjVar);
                listIterator.remove();
            }
        }
    }

    @Override // defpackage.hct
    public final Path i() {
        Path path = this.c;
        path.reset();
        hey heyVar = this.e;
        if (!heyVar.a) {
            int i = heyVar.b;
            if (i == 0) {
                throw null;
            }
            int i2 = i - 1;
            if (i2 == 0) {
                int i3 = 0;
                while (true) {
                    List list = this.d;
                    if (i3 >= list.size()) {
                        break;
                    }
                    path.addPath(((hct) list.get(i3)).i());
                    i3++;
                }
            } else {
                if (i2 == 1) {
                    a(Path.Op.UNION);
                    return path;
                }
                if (i2 == 2) {
                    a(Path.Op.REVERSE_DIFFERENCE);
                    return path;
                }
                if (i2 == 3) {
                    a(Path.Op.INTERSECT);
                    return path;
                }
                if (i2 == 4) {
                    a(Path.Op.XOR);
                    return path;
                }
            }
        }
        return path;
    }
}
