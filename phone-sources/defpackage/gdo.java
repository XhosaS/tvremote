package defpackage;

import android.R;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.support.v7.content.res.AppCompatResources;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.preference.Preference;
import androidx.preference.PreferenceGroup;
import androidx.preference.PreferenceScreen;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gdo extends RecyclerView.Adapter {
    public List a;
    private final PreferenceGroup b;
    private List c;
    private final List d;
    private final Runnable f = new gfe(this, 1, null);
    private final Handler e = new Handler(Looper.getMainLooper());

    public gdo(PreferenceGroup preferenceGroup) {
        this.b = preferenceGroup;
        preferenceGroup.F = this;
        this.c = new ArrayList();
        this.a = new ArrayList();
        this.d = new ArrayList();
        if (preferenceGroup instanceof PreferenceScreen) {
            setHasStableIds(((PreferenceScreen) preferenceGroup).d);
        } else {
            setHasStableIds(true);
        }
        b();
    }

    private final List d(PreferenceGroup preferenceGroup) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int iK = preferenceGroup.k();
        int i = 0;
        for (int i2 = 0; i2 < iK; i2++) {
            Preference preferenceO = preferenceGroup.o(i2);
            if (preferenceO.z) {
                if (!f(preferenceGroup) || i < preferenceGroup.c) {
                    arrayList.add(preferenceO);
                } else {
                    arrayList2.add(preferenceO);
                }
                if (preferenceO instanceof PreferenceGroup) {
                    PreferenceGroup preferenceGroup2 = (PreferenceGroup) preferenceO;
                    if (!preferenceGroup2.S()) {
                        continue;
                    } else {
                        if (f(preferenceGroup) && f(preferenceGroup2)) {
                            throw new IllegalStateException("Nesting an expandable group inside of another expandable group is not supported!");
                        }
                        for (Preference preference : d(preferenceGroup2)) {
                            if (!f(preferenceGroup) || i < preferenceGroup.c) {
                                arrayList.add(preference);
                            } else {
                                arrayList2.add(preference);
                            }
                            i++;
                        }
                    }
                } else {
                    i++;
                }
            }
        }
        if (f(preferenceGroup) && i > preferenceGroup.c) {
            gcr gcrVar = new gcr(preferenceGroup.j, arrayList2, preferenceGroup.dG());
            gcrVar.o = new gdm(this, preferenceGroup);
            arrayList.add(gcrVar);
        }
        return arrayList;
    }

    private final void e(List list, PreferenceGroup preferenceGroup) {
        synchronized (preferenceGroup) {
            Collections.sort(preferenceGroup.b);
        }
        int iK = preferenceGroup.k();
        for (int i = 0; i < iK; i++) {
            Preference preferenceO = preferenceGroup.o(i);
            list.add(preferenceO);
            gdn gdnVar = new gdn(preferenceO);
            List list2 = this.d;
            if (!list2.contains(gdnVar)) {
                list2.add(gdnVar);
            }
            if (preferenceO instanceof PreferenceGroup) {
                PreferenceGroup preferenceGroup2 = (PreferenceGroup) preferenceO;
                if (preferenceGroup2.S()) {
                    e(list, preferenceGroup2);
                }
            }
            preferenceO.F = this;
        }
    }

    private static final boolean f(PreferenceGroup preferenceGroup) {
        return preferenceGroup.c != Integer.MAX_VALUE;
    }

    public final Preference a(int i) {
        if (i < 0 || i >= getItemCount()) {
            return null;
        }
        return (Preference) this.a.get(i);
    }

    public final void b() {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            ((Preference) it.next()).F = null;
        }
        ArrayList arrayList = new ArrayList(this.c.size());
        this.c = arrayList;
        PreferenceGroup preferenceGroup = this.b;
        e(arrayList, preferenceGroup);
        this.a = d(preferenceGroup);
        gdt gdtVar = preferenceGroup.k;
        notifyDataSetChanged();
        for (Preference preference : this.c) {
        }
    }

    public final void c() {
        Handler handler = this.e;
        Runnable runnable = this.f;
        handler.removeCallbacks(runnable);
        handler.post(runnable);
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.a.size();
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    public final long getItemId(int i) {
        if (hasStableIds()) {
            return a(i).dG();
        }
        return -1L;
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    public final int getItemViewType(int i) {
        gdn gdnVar = new gdn(a(i));
        List list = this.d;
        int iIndexOf = list.indexOf(gdnVar);
        if (iIndexOf != -1) {
            return iIndexOf;
        }
        int size = list.size();
        list.add(gdnVar);
        return size;
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    public final /* bridge */ /* synthetic */ void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        gdw gdwVar = (gdw) viewHolder;
        View view = gdwVar.itemView;
        Preference preferenceA = a(i);
        Drawable background = view.getBackground();
        Drawable drawable = gdwVar.a;
        if (background != drawable) {
            gdwVar.itemView.setBackground(drawable);
        }
        TextView textView = (TextView) gdwVar.a(R.id.title);
        if (textView != null && gdwVar.b != null && !textView.getTextColors().equals(gdwVar.b)) {
            textView.setTextColor(gdwVar.b);
        }
        preferenceA.a(gdwVar);
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    public final /* bridge */ /* synthetic */ RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        gdn gdnVar = (gdn) this.d.get(i);
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(viewGroup.getContext());
        TypedArray typedArrayObtainStyledAttributes = viewGroup.getContext().obtainStyledAttributes((AttributeSet) null, gdx.a);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(0);
        if (drawable == null) {
            drawable = AppCompatResources.getDrawable(viewGroup.getContext(), R.drawable.list_selector_background);
        }
        typedArrayObtainStyledAttributes.recycle();
        View viewInflate = layoutInflaterFrom.inflate(gdnVar.a, viewGroup, false);
        if (viewInflate.getBackground() == null) {
            viewInflate.setBackground(drawable);
        }
        ViewGroup viewGroup2 = (ViewGroup) viewInflate.findViewById(R.id.widget_frame);
        if (viewGroup2 != null) {
            int i2 = gdnVar.b;
            if (i2 != 0) {
                layoutInflaterFrom.inflate(i2, viewGroup2);
            } else {
                viewGroup2.setVisibility(8);
            }
        }
        return new gdw(viewInflate);
    }
}
