package com.example.whatsapp_clone.homeMenuFragments.profile

import android.os.Bundle
import android.view.*
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.whatsapp_clone.R
import com.example.whatsapp_clone.databinding.FragmentProfileBinding


class ProfileFragment : Fragment() {
    private var _binding: FragmentProfileBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentProfileBinding.inflate(inflater, container, false)


        //enable support for option menu
        setHasOptionsMenu(true)

        return binding.root
    }

    //create profile menu
    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        inflater.inflate(R.menu.profile_menu, menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.personAccount ->{
                Toast.makeText(requireContext(), "clicked person icon", Toast.LENGTH_SHORT).show()
            }
            R.id.logoutAccount ->{
                Toast.makeText(requireContext(), "clicked logout", Toast.LENGTH_SHORT).show()
            }
            else ->{

            }
        }
        return super.onOptionsItemSelected(item)
    }




    //last code
    override fun onDestroyView() {
        _binding = null
        super.onDestroyView()
    }
}