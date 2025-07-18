package defpackage;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.tabs.TabLayout;
import com.google.android.videos.R;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class uso extends bv {
    private usn a;
    private ViewPager b;
    private ArrayList c;

    @Override // defpackage.bv
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) throws Resources.NotFoundException {
        View viewInflate = layoutInflater.inflate(R.layout.hostname_pager_fragment, viewGroup, false);
        this.c = getArguments().getParcelableArrayList("configs_to_display");
        this.a = new usn(getFragmentManager(), this.c);
        ViewPager viewPager = (ViewPager) viewInflate.findViewById(R.id.pager);
        this.b = viewPager;
        viewPager.h(this.a);
        TabLayout tabLayout = (TabLayout) viewInflate.findViewById(R.id.sliding_tabs);
        if (tabLayout.w != 0) {
            tabLayout.w = 0;
            tabLayout.g();
        }
        tabLayout.o(this.b);
        return viewInflate;
    }
}
