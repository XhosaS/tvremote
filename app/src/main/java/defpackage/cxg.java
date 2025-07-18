package defpackage;

import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public class cxg extends cxi {
    private cxp b;
    private cxm c;
    private cxm d;
    private cxm e;
    private cxm f;
    private cxl g;
    private final ArrayList h;
    private final ArrayList i;
    private cxm j;
    private cxm k;
    private cxm l;
    private cxm m;
    private cxm n;
    private cxm o;
    private cxm p;
    private cxm q;
    private cxm r;
    private cxm s;
    private cxm t;
    private cxm u;
    private cxm v;
    private cxm w;
    private cxm x;

    public cxg(cxk cxkVar) {
        super(cxkVar, null);
        this.h = new ArrayList();
        this.i = new ArrayList();
    }

    @Override // defpackage.cxi
    public final void a(cxk cxkVar) {
        cxl cxlVar = this.g;
        if (cxlVar != null) {
            cxkVar.c(cxlVar, null);
        }
        cxm cxmVar = this.e;
        if (cxmVar != null) {
            cxkVar.a.add(cxmVar);
        }
        cxm cxmVar2 = this.f;
        if (cxmVar2 != null) {
            cxkVar.a.add(cxmVar2);
        }
        cxm cxmVar3 = this.j;
        if (cxmVar3 != null) {
            cxkVar.a.add(cxmVar3);
        }
        cxm cxmVar4 = this.k;
        if (cxmVar4 != null) {
            cxkVar.a.add(cxmVar4);
        }
        cxm cxmVar5 = this.l;
        if (cxmVar5 != null) {
            cxkVar.a.add(cxmVar5);
        }
        cxm cxmVar6 = this.m;
        if (cxmVar6 != null) {
            cxkVar.a.add(cxmVar6);
        }
        cxm cxmVar7 = this.q;
        if (cxmVar7 != null) {
            cxkVar.a.add(cxmVar7);
        }
        cxm cxmVar8 = this.r;
        if (cxmVar8 != null) {
            cxkVar.a.add(cxmVar8);
        }
        cxm cxmVar9 = this.t;
        if (cxmVar9 != null) {
            cxkVar.a.add(cxmVar9);
        }
        cxm cxmVar10 = this.u;
        if (cxmVar10 != null) {
            cxkVar.a.add(cxmVar10);
        }
        cxm cxmVar11 = this.c;
        if (cxmVar11 != null) {
            cxkVar.a.add(cxmVar11);
        }
        cxm cxmVar12 = this.d;
        if (cxmVar12 != null) {
            cxkVar.a.add(cxmVar12);
        }
        cxm cxmVar13 = this.v;
        if (cxmVar13 != null) {
            cxkVar.a.add(cxmVar13);
        }
        cxm cxmVar14 = this.w;
        if (cxmVar14 != null) {
            cxkVar.a.add(cxmVar14);
        }
        cxm cxmVar15 = this.s;
        if (cxmVar15 != null) {
            cxkVar.a.add(cxmVar15);
        }
        cxm cxmVar16 = this.n;
        if (cxmVar16 != null) {
            cxkVar.a.add(cxmVar16);
        }
        cxm cxmVar17 = this.o;
        if (cxmVar17 != null) {
            cxkVar.a.add(cxmVar17);
        }
        cxm cxmVar18 = this.p;
        if (cxmVar18 != null) {
            cxkVar.a.add(cxmVar18);
        }
        cxm cxmVar19 = this.x;
        int i = 0;
        if (cxmVar19 != null) {
            cxkVar.a.add(cxmVar19);
        }
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.h;
            if (i2 >= arrayList.size()) {
                break;
            }
            cxl cxlVar2 = (cxl) arrayList.get(i2);
            cxlVar2.getClass();
            cxkVar.c(cxlVar2, null);
            i2++;
        }
        while (true) {
            ArrayList arrayList2 = this.i;
            if (i >= arrayList2.size()) {
                break;
            }
            cxkVar.c((cxl) arrayList2.get(i), "SUBTYPE_INFO_PREFERENCE");
            i++;
        }
        if (this.b != null) {
            cxk cxkVar2 = new cxk(this.a);
            cxkVar2.b("title", "shortcut");
            cxkVar.c(this.b.a.a(cxkVar2), "SUBTYPE_INTENT");
        }
    }

    final void b(cxe cxeVar) {
        cxp cxpVar = cxeVar.b;
        if (cxpVar != null) {
            this.b = cxpVar;
        }
        int i = cxeVar.j;
        this.c = new cxm(Integer.valueOf(cxeVar.c), "int", "extra_action_id", new String[0]);
        this.d = new cxm(Integer.valueOf(cxeVar.d), "int", "extra_page_id", new String[0]);
        IconCompat iconCompat = cxeVar.a;
        if (iconCompat != null) {
            ArrayList arrayList = new ArrayList();
            cxk cxkVar = new cxk(this.a);
            cxkVar.d(iconCompat, arrayList);
            cxkVar.b("title");
            this.g = cxkVar.a();
        }
        CharSequence charSequence = cxeVar.e;
        if (charSequence != null) {
            this.e = new cxm(charSequence, "text", null, new String[]{"title"});
        }
        CharSequence charSequence2 = cxeVar.f;
        if (charSequence2 != null) {
            this.f = new cxm(charSequence2, "text", null, new String[0]);
        }
        CharSequence charSequence3 = cxeVar.o;
        if (charSequence3 != null) {
            this.j = new cxm(charSequence3, "text", "TAG_TARGET_URI", new String[]{"actions"});
        }
        CharSequence charSequence4 = cxeVar.p;
        if (charSequence4 != null) {
            this.k = new cxm(charSequence4, "text", "TAG_KEY", new String[]{"keywords"});
        }
        if (cxeVar.a != null) {
            this.l = new cxm(0, "int", "SUBTYPE_ICON_NEED_TO_BE_PROCESSED", new String[0]);
        }
        CharSequence charSequence5 = cxeVar.r;
        if (charSequence5 != null) {
            this.t = new cxm(charSequence5, "text", "TAG_RADIO_GROUP", new String[0]);
        }
        CharSequence charSequence6 = cxeVar.g;
        if (charSequence6 != null) {
            c(charSequence6);
        }
        CharSequence charSequence7 = cxeVar.g;
        if (charSequence7 != null) {
            c(charSequence7);
        }
        CharSequence charSequence8 = cxeVar.h;
        if (charSequence8 != null) {
            this.w = new cxm(charSequence8, "text", "extra_preference_info_summary", new String[0]);
        }
        IconCompat iconCompat2 = cxeVar.i;
        if (iconCompat2 != null) {
            this.v = new cxm(iconCompat2, "image", "extra_preference_info_title_icon", new String[0]);
        }
        this.x = new cxm(0, "int", "extra_has_end_icon", new String[0]);
        this.m = new cxm(Integer.valueOf(cxeVar.q), "int", "SUBTYPE_BUTTON_STYLE", new String[0]);
        this.n = new cxm(0, "int", "SUBTYPE_SEEKBAR_MIN", new String[0]);
        this.o = new cxm(0, "int", "SUBTYPE_SEEKBAR_MAX", new String[0]);
        this.p = new cxm(0, "int", "SUBTYPE_SEEKBAR_VALUE", new String[0]);
        this.q = new cxm(Integer.valueOf(cxeVar.s ? 1 : 0), "int", "SUBTYPE_IS_ENABLED", new String[0]);
        boolean z = cxeVar.t;
        this.r = new cxm(1, "int", "SUBTYPE_IS_SELECTABLE", new String[0]);
        this.s = new cxm(0, "int", "extra_preference_add_info_status", new String[0]);
        List list = cxeVar.k;
        List list2 = cxeVar.l;
        List list3 = cxeVar.m;
        for (int i2 = 0; i2 < list.size(); i2++) {
            int iIntValue = ((Integer) list2.get(i2)).intValue();
            if (iIntValue == 1) {
                afg afgVar = (afg) list.get(i2);
                IconCompat iconCompat3 = (IconCompat) afgVar.a;
                int iIntValue2 = ((Integer) afgVar.b).intValue();
                boolean zBooleanValue = ((Boolean) list3.get(i2)).booleanValue();
                ArrayList arrayList2 = new ArrayList();
                if (iIntValue2 != 0) {
                    arrayList2.add("no_tint");
                    if (iIntValue2 == 2) {
                        arrayList2.add("large");
                    }
                }
                if (zBooleanValue) {
                    arrayList2.add("partial");
                }
                cxk cxkVar2 = new cxk(this.a);
                cxkVar2.d(iconCompat3, arrayList2);
                if (zBooleanValue) {
                    cxkVar2.b("partial");
                }
                this.h.add(cxkVar2.a());
            } else if (iIntValue == 2) {
                cxp cxpVar2 = (cxp) list.get(i2);
                boolean zBooleanValue2 = ((Boolean) list3.get(i2)).booleanValue();
                cxk cxkVar3 = new cxk(this.a);
                if (zBooleanValue2) {
                    cxkVar3.b("partial");
                }
                this.h.add(cxpVar2.a.a(cxkVar3));
            }
        }
        List list4 = cxeVar.n;
        for (int i3 = 0; i3 < list4.size(); i3++) {
            String str = (String) ((afg) list4.get(i3)).a;
            String str2 = (String) ((afg) list4.get(i3)).b;
            cxk cxkVar4 = new cxk(this.a);
            cxkVar4.e(str, "title");
            cxkVar4.e(str2, "summary");
            this.i.add(cxkVar4.a());
        }
        for (cxe cxeVar2 : cxeVar.u) {
            cxk cxkVar5 = this.a;
            cxg cxgVar = new cxg(new cxk(cxkVar5));
            cxgVar.b(cxeVar2);
            cxgVar.a.b("list_item");
            cxkVar5.c(cxgVar.d(), "TYPE_PREFERENCE");
        }
    }

    public final void c(CharSequence charSequence) {
        this.u = new cxm(charSequence, "text", "extra_preference_info_text", new String[0]);
    }
}
