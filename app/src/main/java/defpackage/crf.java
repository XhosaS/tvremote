package defpackage;

import android.graphics.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public class crf implements crg, crd {
    private final Path a = new Path();
    private final Path b = new Path();
    private final Path c = new Path();
    private final List d = new ArrayList();
    private final cts e;

    public crf(cts ctsVar) {
        this.e = ctsVar;
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
            crg crgVar = (crg) list.get(size);
            if (crgVar instanceof cqx) {
                cqx cqxVar = (cqx) crgVar;
                List listJ = cqxVar.j();
                int size2 = listJ.size();
                while (true) {
                    size2--;
                    if (size2 >= 0) {
                        Path pathI = ((crg) listJ.get(size2)).i();
                        pathI.transform(cqxVar.h());
                        path.addPath(pathI);
                    }
                }
            } else {
                path.addPath(crgVar.i());
            }
        }
        crg crgVar2 = (crg) list.get(0);
        if (crgVar2 instanceof cqx) {
            cqx cqxVar2 = (cqx) crgVar2;
            List listJ2 = cqxVar2.j();
            for (int i = 0; i < listJ2.size(); i++) {
                Path pathI2 = ((crg) listJ2.get(i)).i();
                pathI2.transform(cqxVar2.h());
                path2.addPath(pathI2);
            }
        } else {
            path2.set(crgVar2.i());
        }
        this.c.op(path2, path, op);
    }

    @Override // defpackage.cqw
    public final void f(List list, List list2) {
        int i = 0;
        while (true) {
            List list3 = this.d;
            if (i >= list3.size()) {
                return;
            }
            ((crg) list3.get(i)).f(list, list2);
            i++;
        }
    }

    @Override // defpackage.cqw
    public final String g() {
        throw null;
    }

    @Override // defpackage.crd
    public final void h(ListIterator listIterator) {
        while (listIterator.hasPrevious() && listIterator.previous() != this) {
        }
        while (listIterator.hasPrevious()) {
            cqw cqwVar = (cqw) listIterator.previous();
            if (cqwVar instanceof crg) {
                this.d.add((crg) cqwVar);
                listIterator.remove();
            }
        }
    }

    @Override // defpackage.crg
    public final Path i() {
        Path path = this.c;
        path.reset();
        cts ctsVar = this.e;
        if (!ctsVar.a) {
            int i = ctsVar.b;
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
                    path.addPath(((crg) list.get(i3)).i());
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
