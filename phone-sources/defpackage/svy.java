package defpackage;

import android.view.MenuItem;
import android.view.SubMenu;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class svy {
    public final fb a;
    public int b = 0;
    public int c = 0;
    public int d = 0;
    private final List e = new ArrayList();

    public svy(fb fbVar) {
        this.a = fbVar;
        c();
    }

    public final int a() {
        return this.e.size();
    }

    public final MenuItem b(int i) {
        return (MenuItem) this.e.get(i);
    }

    public final void c() {
        List list = this.e;
        list.clear();
        this.b = 0;
        this.c = 0;
        this.d = 0;
        int i = 0;
        while (true) {
            fb fbVar = this.a;
            if (i >= fbVar.size()) {
                break;
            }
            MenuItem item = fbVar.getItem(i);
            if (item.hasSubMenu()) {
                if (!list.isEmpty() && !(list.get(list.size() - 1) instanceof svs) && item.isVisible()) {
                    list.add(new svs());
                }
                list.add(item);
                SubMenu subMenu = item.getSubMenu();
                for (int i2 = 0; i2 < subMenu.size(); i2++) {
                    MenuItem item2 = subMenu.getItem(i2);
                    if (!item.isVisible()) {
                        item2.setVisible(false);
                    }
                    list.add(item2);
                    this.b++;
                    if (item2.isVisible()) {
                        this.c++;
                    }
                }
                list.add(new svs());
            } else {
                list.add(item);
                this.b++;
                if (item.isVisible()) {
                    this.c++;
                    this.d++;
                }
            }
            i++;
        }
        if (list.isEmpty() || !(list.get(list.size() - 1) instanceof svs)) {
            return;
        }
        list.remove(list.size() - 1);
    }
}
